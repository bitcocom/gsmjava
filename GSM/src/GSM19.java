import java.util.List;
import gsm.model.MemberDAO;
import gsm.model.MemberVO;
public class GSM19 {
	public static void main(String[] args) {
		MemberDAO dao=new MemberDAO();
		List<MemberVO> list=dao.getAllList();
		if(list.size()==0) {
			System.out.println("데이터가 없습니다.");
		}else {
			for(MemberVO vo : list) {
				System.out.println(vo);
			}
		}
	}
}
