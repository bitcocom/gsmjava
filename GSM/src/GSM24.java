import java.io.*;
public class GSM24 {
	public static void main(String[] args) {
        // ���(��Ʈ��)
		//PrintStream ps=System.out;
		//ps.println(10);
		//System.out.println(10);
	    // ���� copy���α׷�
		try {
			// 73,537
			FileInputStream fis=new FileInputStream("pic.jpg");
			BufferedInputStream bis=new BufferedInputStream(fis);
			
			FileOutputStream fos=new FileOutputStream("pic1.jpg");
			BufferedOutputStream bos=new BufferedOutputStream(fos);			
			int data;
			int cnt=0;
			while((data=bis.read())!=-1) {
			   System.out.println(data);
			   cnt++;
			   bos.write(data);
			}
			bos.close(); // flush()
			System.out.println(cnt);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
