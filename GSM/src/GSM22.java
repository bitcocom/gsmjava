import java.io.*;
public class GSM22 {
	public static void main(String[] args) {
		InputStream is=System.in;
		// 한글 한글자를 입력?
	    System.out.print("한글:");
	    //InputStream in=System.in;
	    //InputStreamReader isr=new InputStreamReader(System.in);
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    try {
			//int data= isr.read();
			//System.out.println((char)data);
	    	System.out.print("문자열을 입력:");
	    	String line=br.readLine();
	    	System.out.println(line);
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	    
	}

}
