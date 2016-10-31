<%@ page language="java" contentType="text/html; charset=gb2312 " import="java.sql.*,java.io.*"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
request.setCharacterEncoding("utf-8");
response.setCharacterEncoding("utf-8");
response.setContentType("text/html;charset=utf-8");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>修改数据</title>
</head>
<body>

<h3><strong>修改结果前为：</strong></h3>
<% 
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance(); 
String connectSQL="jdbc:sqlserver://localhost:1433;DatabaseName=update";
Connection conn=java.sql.DriverManager.getConnection(connectSQL,"sa","");
Statement stmt=conn.createStatement();
int id =Integer.parseInt(request.getParameter("id"));
String name =request.getParameter("name");
int age =Integer.parseInt(request.getParameter("age"));
String sex =request.getParameter("sex");
String major=request.getParameter("major");
String sql="update Student set name = ?,age = ?,sex = ?,major = ? where id =?";
PreparedStatement st=conn.prepareStatement(sql);
st.setString(1,name);
st.setInt(2,age);
st.setString(3,sex);
st.setString(4,major);
st.setInt(5,id);
st.executeUpdate();
System.out.println(st.toString());
stmt.close();
conn.close();
%>
<h4><strong>你已修改信息！</strong></h4>
<%
response.sendRedirect("Update.jsp");
session.setAttribute("info","数据修改成功");
%>
</body>
</html>