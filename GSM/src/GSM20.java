// IO/Network - API
// stream(스트림)-빨대(객체)
import java.io.*;
public class GSM20 {
	public static void main(String[] args) {
      // 표준입출력 - 키보드로부터 데이터를 입력, 화면(콘솔,모니터)출력
	  // Java --JNI-- C
	  // 바이트스트림 VS 문자스트림	
	  InputStream is=System.in;
	  // 키보드로부터 영문한글자 입력(A, 홍)
	  System.out.print("영문1자를 입력:");
	  try {
		int a=is.read(); // 바이트단위(A)->(65)
		System.out.println((char)a);
		a=is.read();
		System.out.println((char)a);
		a=is.read();
		System.out.println((char)a);
	   } catch (Exception e) {
		e.printStackTrace();
	  }
	  
	}
}
