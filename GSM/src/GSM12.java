// JDBC Programming ->API
import java.sql.*;
// DriverManager, Connection, Statement(PreparedStatement), ResultSet 
public class GSM12 {
	public static void main(String[] args) {
       // 1. Driver Class Loading
	   // 2. �����ͺ��̽� ���� ����
		String URL="jdbc:mysql://127.0.0.1:3306/memTbl?serverTimezone=UTC";
		String user="root";
		String password="12345";		
	    try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//DriverManager dm=new com.mysql.cj.jdbc.Driver()
		// 3. ���ᰴü�� ����(Connection)
		Connection conn=DriverManager.getConnection(URL, user, password);
		System.out.println("���Ӽ���");
	    // 4. SQL������ ������ ��ü�� ����
		String SQL="insert into mem(name,age,addr,tel,email) "
				+ "values('�̱浿',44,'����','010-7777-1111','bitcocom@empas.com')";
		Statement st=conn.createStatement();
	    st.executeUpdate(SQL); // ����
	    System.out.println("���强��");
	    } catch (Exception e) { // ���ܴ�����
	    	e.printStackTrace();
	    }	   
	}
}