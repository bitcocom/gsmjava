// JDBC -> java.sql -> MySQL Driver ��ġ(�ٿ�ޱ�->mvnrepository.com->����)
import java.sql.*;
public class GSM15 {
	public static void main(String[] args) {
		String url="jdbc:mysql://127.0.0.1:3306/memTbl?serverTimezone=UTC";
		String user="root";
		String password="12345";
		try { //                          DriverManager---Method : getConnection(url,user,password)            
			Class.forName("com.mysql.cj.jdbc.Driver"); //-Method : getConnection(url,user,password) 
			// ���ᰴü(Connection)
			Connection conn=DriverManager.getConnection(url, user, password);
			String SQL="delete from mem where num=2";
			Statement st=conn.createStatement();
			int cnt=st.executeUpdate(SQL);
			if(cnt>0) {
				System.out.println("��������");
			}else {
				System.out.println("��������");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
