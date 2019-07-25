import java.io.*;
import java.net.*;
public class GSM26 {
	public static void main(String[] args) {
      // IP주소 + PORT번호(65536) -->소켓(Socket) 
	  try {
		ServerSocket ss=new ServerSocket(9000);//Address already in use: JVM_Bind
		System.out.println("server ready...");
		Socket socket=ss.accept(); // socket->client의 정보가 저장됨
		// IO(입출력 스트림)
		InputStream in=socket.getInputStream();
		DataInputStream dis=new DataInputStream(in); 
		String msg=dis.readUTF(); // 야호
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
