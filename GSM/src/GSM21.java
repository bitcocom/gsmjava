import java.io.*;
public class GSM21 {
	public static void main(String[] args) {
		//Ű����κ��� ���� �����ڸ� �Է¹޾Ƽ� ���?
		InputStream is=System.in;
		try {
			System.out.print("���������ڸ� �Է�:");
			while(true) {
		     int data=is.read();//ABCD_| Ctrl+Z(����)
		     if(data==-1) break;
		     System.out.print((char)data);
		    }
			System.out.println("����");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
