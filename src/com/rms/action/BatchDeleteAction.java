package com.rms.action;

import com.rms.domain.User;
import com.rms.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/batchDlete.do")
public class BatchDeleteAction extends HttpServlet {
    UserService service = new UserService();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] temp=req.getParameterValues("uid");
        for (int i=0;i<temp.length;i++) {
            System.out.println(temp[i]);
        }
        int[] uids=new int[200];
        for (int i=0;i<temp.length;i++) {
            System.out.println(temp[i]);
            uids[i]=Integer.parseInt(temp[i]);
        }
        service.batchDeleteUser(uids);
        List<User> users=service.findAllUsers();
        req.setAttribute("Users", users);
        req.getRequestDispatcher("user.jsp").forward(req, resp);
    }
}
