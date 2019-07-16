// JDBC -> java.sql -> MySQL Driver 설치(다운받기->mvnrepository.com->연결)
import java.sql.*;
public class GSM13 {
	public static void main(String[] args) {
		String url="jdbc:mysql://127.0.0.1:3306/memTbl?serverTimezone=UTC";
		String user="root";
		String password="12345";
		try { //                          DriverManager---Method : getConnection(url,user,password)            
			Class.forName("com.mysql.cj.jdbc.Driver"); //-Method : getConnection(url,user,password) 
			// 연결객체(Connection)
			Connection conn=DriverManager.getConnection(url, user, password);
			System.out.println("접속성공");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
