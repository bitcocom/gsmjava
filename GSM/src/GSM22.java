import java.io.*;
public class GSM22 {
	public static void main(String[] args) {
		InputStream is=System.in;
		// �ѱ� �ѱ��ڸ� �Է�?
	    System.out.print("�ѱ�:");
	    //InputStream in=System.in;
	    //InputStreamReader isr=new InputStreamReader(System.in);
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    try {
			//int data= isr.read();
			//System.out.println((char)data);
	    	System.out.print("���ڿ��� �Է�:");
	    	String line=br.readLine();
	    	System.out.println(line);
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	    
	}

}
