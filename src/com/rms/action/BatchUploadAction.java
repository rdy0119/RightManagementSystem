package com.rms.action;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.rms.domain.User;
import com.rms.service.UserService;

@WebServlet("/batchUpload.do")
public class BatchUploadAction extends HttpServlet {
    UserService service=new UserService();
    List<FileItem> fis;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     //获取文件
        try {
          DiskFileItemFactory factory=new DiskFileItemFactory();
          ServletFileUpload upload=new ServletFileUpload(factory);
          upload.setHeaderEncoding("UTF-8"); 
          fis=upload.parseRequest(req);
		} catch (Exception e) {
			e.printStackTrace();
		}
      FileItem f=fis.get(0);
      
      //读取文件内容
      InputStream is=f.getInputStream();
      Workbook book = new XSSFWorkbook(is);
      Sheet sheet=book.getSheetAt(0);
      System.out.println("------------------->rowNum"+sheet.getLastRowNum());
      for(int i=1;i<=sheet.getLastRowNum();i++)
      {
    	  Row row=sheet.getRow(i);
    	  Cell c1=row.getCell(0);
    	  Cell c2=row.getCell(1);
    	  Cell c3=row.getCell(2);
    	  
    	  String uname=c1.getStringCellValue();
    	  String upass=c2.getStringCellValue();;
    	  String trueName=c3.getStringCellValue();
    	  service.addUser(uname, upass, trueName);
      }
      List<User> users=service.findAllUsers();
      req.setAttribute("Users", users);
      req.getRequestDispatcher("user.jsp").forward(req, resp);
    }
}
