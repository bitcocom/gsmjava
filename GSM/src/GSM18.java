import gsm.model.MemberDAO;
import gsm.model.MemberVO;
public class GSM18 {
	public static void main(String[] args) {
      // Ű����κ��� ȸ�������� �Է¹޾Ƽ� DB����? - IO
		String name="���浿";
        int age=58;
        String addr="����";
        String tel="010-1111-1111";
        String email="bbbb@naver.com";	
	  	MemberVO vo=new MemberVO(name, age, addr, tel, email);	  	
	  	MemberDAO dao=new MemberDAO();
	  	int cnt=dao.memInsert(vo);
	  	if(cnt>0) {
	  		System.out.println("���强��");
	  	}else {
	  		System.out.println("�������");
	  	}
	}
}
