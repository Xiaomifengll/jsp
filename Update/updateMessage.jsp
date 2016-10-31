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
<title>修改数据信息</title>
</head>
<body>
<center>
<% 
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance(); 
String connectSQL="jdbc:sqlserver://localhost:1433;DatabaseName=update";
Connection conn=java.sql.DriverManager.getConnection(connectSQL,"sa","");
Statement stmt=conn.createStatement();
int id =Integer.parseInt(request.getParameter("id"));
ResultSet rs= stmt.executeQuery("select * from Student where id="+id);
String name ="";
int age =0;
String sex ="";
String major ="";
while(rs.next()){
	id=rs.getInt("id");
	name=rs.getString("name");
	age=rs.getInt("age");
	sex=rs.getString("sex");
	major=rs.getString("major");
}
%>
</center>
<center>
<p>请修改下面信息</p>
<form action="message.jsp" method="post">
<p>学号：<input type="hidden" name="id" value='<%=id%>'/><%=id%></p>
<p>姓名：<input type="text" name="name" value='<%=name%>'/></p>
<p>年龄：<input type="text" name="age" value='<%=age%>'/></p>
<p>性别：<input type="text" name="sex" value='<%=sex%>'/></p>
<p>专业：<input type="text" name="major" value='<%=major%>'/></p>
<button type="submit">提交</button>
</form>
</center>
</body>
</html>