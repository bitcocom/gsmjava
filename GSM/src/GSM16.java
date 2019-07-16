// JDBC -> java.sql -> MySQL Driver 설치(다운받기->mvnrepository.com->연결)
import java.sql.*;
import java.util.*;
import gsm.model.*;
public class GSM16 {
	public static void main(String[] args) {
		String url="jdbc:mysql://127.0.0.1:3306/memTbl?serverTimezone=UTC";
		String user="root";
		String password="12345";
		List<MemberVO> list=new ArrayList<MemberVO>();
		try { //                          DriverManager---Method : getConnection(url,user,password)            
			Class.forName("com.mysql.cj.jdbc.Driver"); //-Method : getConnection(url,user,password) 
			// 연결객체(Connection)
			Connection conn=DriverManager.getConnection(url, user, password);
			String SQL="select * from mem";
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(SQL);
			while(rs.next()) {
				int num=rs.getInt("num");
				String name=rs.getString("name");
				int age=rs.getInt("age");
				String addr=rs.getString("addr");
				String tel=rs.getString("tel");
				String email=rs.getString("email");	
				// 묶어준다(VO)->담는다(ArrayList)
				MemberVO vo=new MemberVO(num, name, age, addr, tel, email);
				list.add(vo);
			}//_while_
			for(int i=0;i<list.size();i++) {
				MemberVO vo=list.get(i);
			   System.out.println(vo);	
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
