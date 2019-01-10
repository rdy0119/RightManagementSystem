<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="com.rms.domain.*" %>
<%@ page import="java.lang.*" %>  
<%@ page import="java.util.*" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>roles</title>
</head>
<body>
    <h3 align="center">角色信息</h3>
    <p align="center"><a href="addRole.jsp">添加角色</a></p>
	<table  align="center"  border="1">
		<thead >
           <tr bordercolor="blue" >
	          <td height="30" width="60px" >rid</td>
			  <td width="90px" align="left">角色名</td>
			  <td width="90px" align="left">密描述</td>
			  <td width="100px" align="center">操作</td>
           </tr>
		</thead>
		<tbody>
		<% List<Role> roles=(List<Role>)request.getAttribute("Roles");%>
		<% for(Role role:roles){%>
           <tr>
	          <td height="30" width="60px"><%= role.getRid() %></td>
			  <td width="90px"><%= role.getRname() %></td>
			  <td width="90px"><%= role.getDes() %></td>
			  <td width="100px" align="center">
			  <a href="UpdateRole.jsp?rid=<%=role.getRid()%>&rname=<%=role.getRname()%>
			                          &des=<%= role.getDes() %>" >修改</a>
			  |<a href="deleteRole.do?rid=<%=role.getRid()%>">删除</a>
			  </td>
           </tr>			
		<% } %>
		
		</tbody>	
	</table>
</body>
</html>