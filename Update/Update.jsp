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
<title>修改学生数据</title>
</head>
<body>

<center><h3><strong>学生信息如下</strong></h3></center>
<hr>
<center>
<% 
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance(); 
String connectSQL="jdbc:sqlserver://localhost:1433;DatabaseName=update";
Connection conn=java.sql.DriverManager.getConnection(connectSQL,"sa","");
Statement stmt=conn.createStatement();
ResultSet rs= stmt.executeQuery("select * from Student");
out.println("<table border=1 width=450px");
while(rs.next()){
	out.println("<tr>");
	out.println("<td width=150px>"+rs.getInt("id")+"<a href='updateMessage.jsp?id="+rs.getInt("id")+"'>修改</a>"+("</td>"));
	out.println("<td width=100px>"+rs.getString("name")+("</td>"));
	out.println("<td width=50px>"+rs.getInt("age")+("</td>"));
	out.println("<td width=50px>"+rs.getString("sex")+("</td>"));
	out.println("<td width=100px>"+rs.getString("major")+("</td>"));
}
out.println("</table>");
rs.close();
stmt.close();
conn.close();
%>
结果：
<%=session.getAttribute("info")
%>
</body>
</html>