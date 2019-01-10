<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<jsp:useBean id="role"  class="com.rms.domain.Role" scope="request"></jsp:useBean>
<jsp:setProperty name="role" property="*" />
<jsp:forward page="AddRole.do" />
