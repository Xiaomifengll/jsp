package lol;

public class HeroServlet extends HttpServlet { private static final long serialVersionUID = 1L;

public HeroServlet() {

super();

}

/**

* ��ʾĳһ��Ӣ�ۣ��鿴�ͱ༭ĳһ��Ӣ��ʱ�����õ����������

*/

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

HeroManager manager = new HeroManager();//���ɹ������manager.

int id = Integer.parseInt(request.getParameter("id"));

String isChange = request.getParameter("is_change");

String directPage = "";

Hero hero = manager.findOne(id);

if(isChange != null){

directPage = "/lolView/update.jsp";

}else{

directPage = "/lolView/hero.jsp";

}

//����hero��ֵת��

RequestDispatcher dis = request.getRequestDispatcher(directPage); dis.forward(request, response);

}

/**

* �޸ġ����ĳһ��Ӣ��

*/

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//ת��

request.setCharacterEncoding("utf-8"); response.setCharacterEncoding("utf-8");

String idStr = request.getParameter("id");//�ӱ����Ӣ��id

HeroManager manager = new HeroManager();//ʹ��manager����͸ղŴ��ݹ�����id����ȡӢ�� Hero hero = new Hero();//����һ���µ�Ӣ�۶���

hero.setName(request.getParameter("name"));
 

-1-
 
E:\projects\lol\src\com\lol\control\HeroServlet.java	2016��11��28�� 14:09

//��ǰ̨���Ӣ��name������ֵ����ղ�������hero�����У��������ơ�

hero.setNickName(request.getParameter("nickName")); hero.setAvatar(request.getParameter("avatar")); hero.setImage(request.getParameter("image")); hero.setDesc(request.getParameter("desc"));

String info;

if(idStr == null){//���ҳ�洫�ݹ���û��id���������Ӣ��

manager.add(hero); info = "Ӣ���ѳɹ���ӣ�";

}else{//���ҳ�洫�ݹ�����id��˵�����޸�Ӣ��

int id = Integer.parseInt(idStr); hero.setId(id);
manager.modify(hero); info = "Ӣ���ѳɹ��޸ģ�";
}

request.setAttribute("info", info); request.setAttribute("hero", hero);

RequestDispatcher dis = request.getRequestDispatcher("/lolView/hero.jsp"); dis.forward(request, response);
}

}
