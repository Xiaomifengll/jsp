package lol;

public class HeroServlet extends HttpServlet { private static final long serialVersionUID = 1L;

public HeroServlet() {

super();

}

/**

* 显示某一个英雄，查看和编辑某一个英雄时都会用到这个方法。

*/

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

HeroManager manager = new HeroManager();//生成管理对象manager.

int id = Integer.parseInt(request.getParameter("id"));

String isChange = request.getParameter("is_change");

String directPage = "";

Hero hero = manager.findOne(id);

if(isChange != null){

directPage = "/lolView/update.jsp";

}else{

directPage = "/lolView/hero.jsp";

}

//带着hero的值转向。

RequestDispatcher dis = request.getRequestDispatcher(directPage); dis.forward(request, response);

}

/**

* 修改、添加某一个英雄

*/

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//转码

request.setCharacterEncoding("utf-8"); response.setCharacterEncoding("utf-8");

String idStr = request.getParameter("id");//从表单获得英雄id

HeroManager manager = new HeroManager();//使用manager对象和刚才传递过来的id，获取英雄 Hero hero = new Hero();//声明一个新的英雄对象

hero.setName(request.getParameter("name"));
 

-1-
 
E:\projects\lol\src\com\lol\control\HeroServlet.java	2016年11月28日 14:09

//从前台获得英雄name，并把值放入刚才申明的hero对象中，下面类似。

hero.setNickName(request.getParameter("nickName")); hero.setAvatar(request.getParameter("avatar")); hero.setImage(request.getParameter("image")); hero.setDesc(request.getParameter("desc"));

String info;

if(idStr == null){//如果页面传递过来没有id，则是添加英雄

manager.add(hero); info = "英雄已成功添加！";

}else{//如果页面传递过来有id，说明是修改英雄

int id = Integer.parseInt(idStr); hero.setId(id);
manager.modify(hero); info = "英雄已成功修改！";
}

request.setAttribute("info", info); request.setAttribute("hero", hero);

RequestDispatcher dis = request.getRequestDispatcher("/lolView/hero.jsp"); dis.forward(request, response);
}

}
