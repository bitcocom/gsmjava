import com.google.gson.Gson;
import bit.gsm.BookVO;
public class GSM11 {
	public static void main(String[] args) {
       // MyUtil --> 직접만든 API
	   // ArrayList, String --> JAVA API	
	   // Gson --> 제 3의 기관이 만든 API : https://mvnrepository.com	 
	   BookVO vo=new BookVO("자바", 23000, "홍길동");
	   Gson g=new Gson();
	   String s=g.toJson(vo);// dict --> JSON, XML 
	   System.out.println(s);//{"title":"자바","price":23000,"name":"홍길동"}
	   
	   BookVO v=g.fromJson(s, BookVO.class);
	   System.out.println(v);
	}
}
/*
 ->JDBC, IO, Network, GUI
 */
