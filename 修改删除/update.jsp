<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>，
<%@ page import="java.sql.*"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>更改</title>
</head>
<body>
<%
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
String connectSQL="jdbc:sqlserver://localhost:1433;DatabaseName=Hello";
String user1="sa";
String password1="root";

Connection conn=
DriverManager.getConnection(user1,password1);

String sql = "delete from info where studentsex=‘男’";
PreparedStatement st = conn.prepareStatement(sql);
st.executeUpdate(sql);

st.close();
conn.close();
%>

</body>
</html>