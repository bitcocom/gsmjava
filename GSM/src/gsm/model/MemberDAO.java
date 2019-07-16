package gsm.model;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
// JDBC -> (MyBatis Framework) : java code <- 분리--> xml : http://mybatis.org(API)
public class MemberDAO {
   private Connection conn;
   private PreparedStatement ps;
   private ResultSet rs;
   private Connection getConnect() {
	    String URL="jdbc:mysql://127.0.0.1:3306/memTbl?serverTimezone=UTC";
		String user="root";
		String password="12345";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(URL, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
   }//connection
   // CRUD -> Create
   public int memInsert(MemberVO vo) {
	   conn=getConnect();
	   String SQL="insert into mem(name,age,addr,tel,email) values(?,?,?,?,?)";
	   int cnt=0;
	   try {
		 ps=conn.prepareStatement(SQL);
		 ps.setString(1, vo.getName());
		 ps.setInt(2, vo.getAge());
		 ps.setString(3, vo.getAddr());
		 ps.setString(4, vo.getTel());
		 ps.setString(5, vo.getEmail());
		 cnt=ps.executeUpdate(); // 1		 
	   } catch (Exception e) {
		e.printStackTrace();
	   }	
	   return cnt;
   }//_memInsert_
   // 전체회원 목록을 이름을 오름차순 출력
   public List<MemberVO>  getAllList(){
	   conn=getConnect();
	   String SQL="select * from mem order by name asc";
	   List<MemberVO> list=new ArrayList<MemberVO>();
	   try {
		ps=conn.prepareStatement(SQL);
		rs=ps.executeQuery();
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
	   } catch (Exception e) {
		e.printStackTrace();
	  }
	   return list;
   }//_getAllList_
}
