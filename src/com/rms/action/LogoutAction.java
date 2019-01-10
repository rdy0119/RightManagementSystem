/**
 * 
 */
package com.rms.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Administrator
 *
 */
@WebServlet("/logout.do")
public class LogoutAction extends HttpServlet {

@Override
protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
  arg0.getSession().setAttribute("LoginUser", null);
  arg1.sendRedirect("login.html");
}
}
