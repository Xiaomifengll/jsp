package lol;


import java.io.IOException; import java.util.List;

import javax.servlet.ServletException; import javax.servlet.annotation.WebServlet; import javax.servlet.http.HttpServlet; import javax.servlet.http.HttpServletRequest; import javax.servlet.http.HttpServletResponse;

public class ShowHeroesServlet<HttpServletRequest, HttpServletResponse> extends HttpServlet { private static final long serialVersionUID = 1L;

public ShowHeroesServlet() {

}

/**

* 显示全部的英雄.

*/

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

HeroManager manager = new HeroManager();//生成一个manager对象

List<Hero> heroes = manager.findAll();//找到所有的英雄

((Object) request).setAttribute("heroes", heroes);//将所有的英雄放到request中

RequestDispatcher dis = request.getRequestDispatcher("/lolView/heroes.jsp"); dis.forward(request, response);//带着所有的英雄转向。
}

}
