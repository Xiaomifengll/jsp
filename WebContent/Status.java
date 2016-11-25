import java.util.ArrayList;
import java.util.HashMap;


public class Status {
	private ArrayList<String>zhuangTai;
	private  HashMap<String,ArrayList<String>>tiMu;
	
	public Status (){
	zhuangTai=new ArrayList<String>();
	tiMu=new HashMap<String,ArrayList<String>>();
	
	
    String xuanXiang1="我手机静音了";
    String xuanXiang2="我在玩游戏";
    String xuanXiang3="我在给你买东西";
    String xuanXiang4="我在工作";
    String xuanXiang5="我吃饭去了，忘带手机了";
    String xuanXiang6="我手机没电了，在充电";
 ArrayList<String> temp=new ArrayList<String>();

      temp.add(xuanXiang1);
      temp.add(xuanXiang2);
      temp.add(xuanXiang3);
      temp.add(xuanXiang4);
      temp.add(xuanXiang5);
      temp.add(xuanXiang6);
     String qingKuang = null;
	tiMu.put(qingKuang,temp);

	}


 public ArrayList<String>getzhuangTai(){
	 return getzhuangTai();
 }
 public void setZhuangTai(ArrayList<String>zhuangTai){
	 this.zhuangTai=zhuangTai;
 }
 
 
 public HashMap<String,ArrayList<String>>getTimu(){
	 return getTimu();
 }}
 
 
 