<%@ page language="java" contentType="text/html; charset=UTF-8""
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>你有可能会死？</title>
</head>
<body>
<%
        GirlFriend gf=(GirlFriend)session.getAttribute("myGirlFriend");
        String phone=request.getParameter("phone");

        int shengQi=gf.getshengQi();
        int ai=gf.getAi();
        
        
        if(phone.equals("0")){
        	shengQi=shengQi+10;
        }else if(phone.equals("1")){
        	shengQi=shengQi+30;
        } if (phone.equals("2")){
        ai=ai+20;
        }else{
        	ai=ai+10;
        	shengQi=shengQi+10;
        	gf.setshengQi(shengQi);
        	gf.setAi(ai);
        	
        	
        	if(gf.getshengQi()>20){
        		out.print("<h1>恭喜你，你可以转身了");
        	}else{
        		out.print("<h1>哈哈哈，你要小心点，她可要"+gf.getshengQi()+"</h1>");
        		
        		
        		
        		if(gf.Ai()>30){
        			out.print("<h1>哎呀，不错哦，她还是很爱你的</h1>");
        		}
        		out.print("<p><a href='status.jsp'>Go on</a></p>");
        		
        	}
        	if (gf.getAi()>100){
        		out.print("<h1>结婚啦啦</h1>");
        	}
%>
</body>
</html>