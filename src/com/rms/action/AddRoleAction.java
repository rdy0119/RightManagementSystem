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

import com.rms.domain.Role;
import com.rms.service.RoleService;

/**
 * @author Administrator
 *
 */
@WebServlet("/AddRole.do")
public class AddRoleAction extends HttpServlet {
    RoleService service=new RoleService();

    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
         Role role=(Role)arg0.getAttribute("role");
    	
        // service.addRole(arg0.getParameter("rname"), arg0.getParameter("des"));
         service.addRole(role.getRname(), role.getDes());
         List<Role> roles=service.findAllRoles();
         arg0.setAttribute("Roles", roles);
         arg0.getRequestDispatcher("roles.jsp").forward(arg0, arg1);
    }
}
