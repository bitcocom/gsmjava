import gsm.model.MemberDAO;
import gsm.model.MemberVO;
public class GSM18 {
	public static void main(String[] args) {
      // 키보드로부터 회원정보를 입력받아서 DB저장? - IO
		String name="조길동";
        int age=58;
        String addr="제주";
        String tel="010-1111-1111";
        String email="bbbb@naver.com";	
	  	MemberVO vo=new MemberVO(name, age, addr, tel, email);	  	
	  	MemberDAO dao=new MemberDAO();
	  	int cnt=dao.memInsert(vo);
	  	if(cnt>0) {
	  		System.out.println("저장성공");
	  	}else {
	  		System.out.println("저장실패");
	  	}
	}
}
