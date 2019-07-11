// JDBC Programming ->API
import java.sql.*;
// DriverManager, Connection, Statement(PreparedStatement), ResultSet 
public class GSM12 {
	public static void main(String[] args) {
       // 1. Driver Class Loading
	   // 2. 데이터베이스 접속 정보
		String URL="jdbc:mysql://127.0.0.1:3306/memTbl?serverTimezone=UTC";
		String user="root";
		String password="12345";		
	    try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//DriverManager dm=new com.mysql.cj.jdbc.Driver()
		// 3. 연결객체를 생성(Connection)
		Connection conn=DriverManager.getConnection(URL, user, password);
		System.out.println("접속성공");
	    // 4. SQL문장을 전송할 객체를 생성
		String SQL="insert into mem(name,age,addr,tel,email) "
				+ "values('이길동',44,'서울','010-7777-1111','bitcocom@empas.com')";
		Statement st=conn.createStatement();
	    st.executeUpdate(SQL); // 실행
	    System.out.println("저장성공");
	    } catch (Exception e) { // 예외다형성
	    	e.printStackTrace();
	    }	   
	}
}