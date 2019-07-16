// JDBC Programming ->API
import java.sql.*;
// DriverManager, Connection, Statement(PreparedStatement), ResultSet 
public class GSM17 {
	public static void main(String[] args) {
        String name="나자바";
        int age=38;
        String addr="서울";
        String tel="010-1111-1111";
        String email="bbbb@naver.com";
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
	    String SQL="insert into mem(name,age,addr,tel,email) values(?,?,?,?,?)";
		PreparedStatement ps=conn.prepareStatement(SQL);
		ps.setString(1, name);
		ps.setInt(2, age);
		ps.setString(3, addr);
		ps.setString(4, tel);
		ps.setString(5, email);
		int cnt=ps.executeUpdate();
		if(cnt>0) {
			System.out.println("저장성공");
		}else {
			System.out.println("저장실패");
		}
	    } catch (Exception e) { // 예외다형성
	    	e.printStackTrace();
	    }	   
	}
}