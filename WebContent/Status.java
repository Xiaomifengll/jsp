import java.util.ArrayList;
import java.util.HashMap;


public class Status {
	private ArrayList<String>zhuangTai;
	private  HashMap<String,ArrayList<String>>tiMu;
	
	public Status (){
	zhuangTai=new ArrayList<String>();
	tiMu=new HashMap<String,ArrayList<String>>();
	
	
    String xuanXiang1="���ֻ�������";
    String xuanXiang2="��������Ϸ";
    String xuanXiang3="���ڸ�������";
    String xuanXiang4="���ڹ���";
    String xuanXiang5="�ҳԷ�ȥ�ˣ������ֻ���";
    String xuanXiang6="���ֻ�û���ˣ��ڳ��";
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
 
 
 