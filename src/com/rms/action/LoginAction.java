/**
 * 
 */
package com.rms.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
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
@WebServlet("/login.do")
public class LoginAction extends HttpServlet{
    /**
	 * TODO ÌîÐ´×¢ÊÍ
	 */
	private static final long serialVersionUID = 1L;
	UserService service=new UserService();

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		arg0.setCharacterEncoding("utf-8");
		String uname=arg0.getParameter("uname");
		String upass=arg0.getParameter("upass");
		User user=service.checkLogin(uname, upass);
		if(user!=null){
			arg0.getSession().setAttribute("loginUser", user);
			arg1.sendRedirect("main.html");
		}
		else {
			arg1.sendRedirect("login.html");
		}
	}
}
