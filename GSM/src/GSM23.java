import java.io.*;
public class GSM23 {
	public static void main(String[] args) {
		// 키보드로부터 라인단위로 문자열을 읽어들이는 스트림의 연결방법
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=null;
		try {
		 System.out.print("문자열입력:");	//exit
		 while(!(line=br.readLine()).equals("exit")) {
			System.out.println(line);
			System.out.print("문자열입력:");	
		 }
		 System.out.println("종료");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
