<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>展示女朋友的界面</title>
<jsp:useBean id="myGirlFriend"class="com.sccc.girlFriend" scope="session"/>
<!--  -->
<jsp:setProperty name="myGirlFriend" property="Yanzhi"/>
<jsp:setProperty name="myGirlFriend" property="TiZhong"/>
<jsp:setProperty name="myGirlFriend" property="ShenGao"/>
<jsp:setProperty name="myGirlFriend" property=" shengQi"/>
<jsp:setProperty name="myGirlFriend" property="Ai"/>
-->
</head>
<body>
<p>女朋友的颜值：<jsp:getProperty name="myGirlFriend" property="Yanzhi">分</p>
<p>女朋友的体重：<jsp:getProperty name="myGirlFriend" property="TiZhong">kg</p>
<p>女朋友的身高：<jsp:getProperty name="myGirlFriend" property="ShenGao">cm</p>
<p>女朋友的怒值：<jsp:getProperty name="myGirlFriend" property=" shengQi"></p>
<p>女朋友的爱值：<jsp:getProperty name="myGirlFriend" property="Ai"></p>
<p><a href="status.jsp">前方高能！！开始测试！！</a></p>
</body>
</html>