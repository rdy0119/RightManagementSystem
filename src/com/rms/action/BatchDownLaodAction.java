/**
 * 
 */
package com.rms.action;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.rms.domain.User;
import com.rms.service.UserService;

/**
 * @author Administrator
 *
 */
@WebServlet("/batchDownload.do")
public class BatchDownLaodAction extends HttpServlet {
    UserService service=new UserService();
    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
        List<User> users=service.findAllUsers();
        
        Workbook book=new XSSFWorkbook();
        Sheet sheet=book.createSheet();
        Row r1=sheet.createRow(0);
        r1.createCell(0).setCellValue("Uname");
        r1.createCell(1).setCellValue("upass");
        r1.createCell(2).setCellValue("trueName");
        
        for(int i=0;i<users.size();i++) {
          Row r=sheet.createRow(i+1);
          r.createCell(0).setCellValue(users.get(i).getUname());
          r.createCell(1).setCellValue(users.get(i).getUpass());
          r.createCell(2).setCellValue(users.get(i).getTrueName());
        }
        
        FileOutputStream os = new FileOutputStream("d:/users.xlsx");
    	book.write(os);
    	os.flush();
    	FileInputStream is = new FileInputStream("d:/users.xlsx");
    	arg1.setHeader("content-disposition", "attachment;filename=users.xlsx");
            //将响应的内容形成一个独立的文件。
    	while(true) {
    		int b = is.read();
    		if(b == -1)
    			break ;
    		arg1.getOutputStream().write(b);
    	}
    	
        
    }
}
