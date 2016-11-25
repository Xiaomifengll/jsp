<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>突然状况！！！</title>
</head>
<body>
<jsp:useBean id="stats" class="com.sccc.Status" scope="session"/>
<h1>这不是演习！！这不是演习！</h1>
<form action="showInfo.jsp" method="post">
<%
  String test=status.getZhungTai().get(0);
ArrayList<String>xuanXiang=status.getTiMu().get(test);
 out.println("<h1>"+test+"应该怎么回答？！！想清楚啊</h1>");

for(int i=0;i<4;i++){
	String neiRong=xuanXiang.get(i);
	String num=String.valueOf(i);
	out.print("<p><input type='radio' name='phone' value='+'"+num+"'>"+neiRong+ "</input></p>");
}

%>
<button>提交</button>


</form>
</body>
</html>