import java.io.*;
import java.net.*;
public class GSM27 {
	public static void main(String[] args) {
        try {
			Socket socket=new Socket("127.0.0.1", 9000);// socket->server�� ������ ����
			System.out.println("connection success!!");
			// Ű����κ��� ���ڿ��� �Է¹޴� ��Ʈ�� ����?
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("message:");
			String msg=br.readLine();
			OutputStream out=socket.getOutputStream();
			DataOutputStream dos=new DataOutputStream(out);
			dos.writeUTF(msg); // ������-->msg
			
			InputStream in=socket.getInputStream();
			DataInputStream dis=new DataInputStream(in); 
			String receive=dis.readUTF();
			System.out.println("received :"+ receive);
			
			dis.close();
			dos.close();
			socket.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
