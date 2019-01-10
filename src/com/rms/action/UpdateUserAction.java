/**
 * 
 */
package com.rms.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rms.domain.User;
import com.rms.service.UserService;

/**
 * @author Administrator
 *
 */
@WebServlet("/UpdateUser.do")
public class UpdateUserAction extends HttpServlet {
    UserService service=new UserService();
    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
      String uname=arg0.getParameter("uname");
      String upass=arg0.getParameter("upass");
      String trueName=arg0.getParameter("trueName");
      int uid=Integer.parseInt(arg0.getParameter("uid"));
      service.updateUser(uname, upass, trueName, uid);
      
      List<User> users=service.findAllUsers();
      arg0.setAttribute("Users", users);
      arg0.getRequestDispatcher("user.jsp").forward(arg0, arg1);
    }
	
}
