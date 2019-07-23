import java.io.*;
public class GSM21 {
	public static void main(String[] args) {
		//키보드로부터 영문 여러자를 입력받아서 출력?
		InputStream is=System.in;
		try {
			System.out.print("영문여러자를 입력:");
			while(true) {
		     int data=is.read();//ABCD_| Ctrl+Z(강제)
		     if(data==-1) break;
		     System.out.print((char)data);
		    }
			System.out.println("종료");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
