import java.io.*;
public class GSM23 {
	public static void main(String[] args) {
		// Ű����κ��� ���δ����� ���ڿ��� �о���̴� ��Ʈ���� ������
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=null;
		try {
		 System.out.print("���ڿ��Է�:");	//exit
		 while(!(line=br.readLine()).equals("exit")) {
			System.out.println(line);
			System.out.print("���ڿ��Է�:");	
		 }
		 System.out.println("����");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
