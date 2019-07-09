import java.util.ArrayList;

import bit.gsm.BookVO;
import bit.gsm.ObjectArray;

public class GSM09 {
	public static void main(String[] args) {
        // 책-생성+초기화->BookVO()
		BookVO vo1=new BookVO("자바1", 25000, "홍길동");
		BookVO vo2=new BookVO("자바2", 25000, "홍길동");
		BookVO vo3=new BookVO("자바3", 25000, "홍길동");
		// ObjectArray
		//ObjectArray arr=new ObjectArray();
		ArrayList<BookVO> arr=new ArrayList<BookVO>();
		arr.add(vo1); //upcasting
		arr.add(vo2);
		arr.add(vo3);  // 3
		for(int i=0;i<arr.size();i++) {
			    BookVO vo=arr.get(i); // downcasting
			    System.out.println(vo);
		}
	}
}
