/**
 * 
 */
package com.rms.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.rms.domain.User;

/**
 * @author Administrator
 *
 */
public class LoginFilter implements Filter{

	@Override
	public void destroy() {
		
	}


	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)arg0;
		HttpServletResponse res=(HttpServletResponse)arg1;
		
		arg0.setCharacterEncoding("utf-8");
		
		String path=req.getServletPath();
		if(path.indexOf("login.do")!=-1|path.indexOf("login.html")!=-1)
		{
			
			arg2.doFilter(arg0, arg1);
            return;			
		}
		
		HttpSession session = req.getSession(true);
		User user=(User)session.getAttribute("loginUser");
		if(user==null) {
			res.sendRedirect("login.html");
		}else {
			arg2.doFilter(arg0, arg1);
		}
		
	}


	@Override
	public void init(FilterConfig arg0) throws ServletException {

		
	}

}
