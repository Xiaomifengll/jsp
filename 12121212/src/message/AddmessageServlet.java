package message;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddmessageServlet extends HttpServlet {

	protected  void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {
	 doPost(request,response);

}
protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {
String author=new
String (request.getParameter("author").getBytes("ISO-8859-1"),"UTF-8");
String title=new
String (request.getParameter("title").getBytes("ISO-8859-1"),"ISO-8859-1");
String content=new
String (request.getParameter("content").getBytes("ISO-8859-1"),"ISO-8859-1");
SimpleDateFormat format=new
SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
String today=format.format(new Date(0));
MessageBean mm=new MassageBean();
  mm.setAuthor(author);
  mm.setTitle(title);
  mm.setContent(content);
  mm.setTime(today);
  HttpServletRequest session=(HttpServletRequest) request.getSession();
  ServletContext scx=session.getServletContext();
  ArrayList wordList=(ArrayList)scx.getAttribute("wordList");
  if(wordList==null)
	  wordList=new ArrayList();
  wordList.add(mm);
  scx.setAttribute("wordlist",wordList);
  response.sendRedirect("showMessage.jsp");
  
  
  
  
  
}
}
