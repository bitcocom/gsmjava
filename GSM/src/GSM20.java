// IO/Network - API
// stream(��Ʈ��)-����(��ü)
import java.io.*;
public class GSM20 {
	public static void main(String[] args) {
      // ǥ������� - Ű����κ��� �����͸� �Է�, ȭ��(�ܼ�,�����)���
	  // Java --JNI-- C
	  // ����Ʈ��Ʈ�� VS ���ڽ�Ʈ��	
	  InputStream is=System.in;
	  // Ű����κ��� �����ѱ��� �Է�(A, ȫ)
	  System.out.print("����1�ڸ� �Է�:");
	  try {
		int a=is.read(); // ����Ʈ����(A)->(65)
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
