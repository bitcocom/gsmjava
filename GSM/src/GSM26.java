import java.io.*;
import java.net.*;
public class GSM26 {
	public static void main(String[] args) {
      // IP�ּ� + PORT��ȣ(65536) -->����(Socket) 
	  try {
		ServerSocket ss=new ServerSocket(9000);//Address already in use: JVM_Bind
		System.out.println("server ready...");
		Socket socket=ss.accept(); // socket->client�� ������ �����
		// IO(����� ��Ʈ��)
		InputStream in=socket.getInputStream();
		DataInputStream dis=new DataInputStream(in); 
		String msg=dis.readUTF(); // ��ȣ
		System.out.println(msg);
		
		OutputStream out=socket.getOutputStream();
		DataOutputStream dos=new DataOutputStream(out);
		dos.writeUTF("[ECHO Server]"+msg);
		
		dis.close();
		dos.close();
		socket.close();
		ss.close();
	  } catch (IOException e) {		
		e.printStackTrace();
	  }
	}
}
