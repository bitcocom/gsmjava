import com.google.gson.Gson;
import bit.gsm.BookVO;
public class GSM11 {
	public static void main(String[] args) {
       // MyUtil --> �������� API
	   // ArrayList, String --> JAVA API	
	   // Gson --> �� 3�� ����� ���� API : https://mvnrepository.com	 
	   BookVO vo=new BookVO("�ڹ�", 23000, "ȫ�浿");
	   Gson g=new Gson();
	   String s=g.toJson(vo);// dict --> JSON, XML 
	   System.out.println(s);//{"title":"�ڹ�","price":23000,"name":"ȫ�浿"}
	   
	   BookVO v=g.fromJson(s, BookVO.class);
	   System.out.println(v);
	}
}
/*
 ->JDBC, IO, Network, GUI
 */
