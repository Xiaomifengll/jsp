package lol;


import java.io.IOException; import java.util.List;

import javax.servlet.ServletException; import javax.servlet.annotation.WebServlet; import javax.servlet.http.HttpServlet; import javax.servlet.http.HttpServletRequest; import javax.servlet.http.HttpServletResponse;

public class ShowHeroesServlet<HttpServletRequest, HttpServletResponse> extends HttpServlet { private static final long serialVersionUID = 1L;

public ShowHeroesServlet() {

}

/**

* ��ʾȫ����Ӣ��.

*/

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

HeroManager manager = new HeroManager();//����һ��manager����

List<Hero> heroes = manager.findAll();//�ҵ����е�Ӣ��

((Object) request).setAttribute("heroes", heroes);//�����е�Ӣ�۷ŵ�request��

RequestDispatcher dis = request.getRequestDispatcher("/lolView/heroes.jsp"); dis.forward(request, response);//�������е�Ӣ��ת��
}

}
