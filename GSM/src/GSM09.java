import java.util.ArrayList;

import bit.gsm.BookVO;
import bit.gsm.ObjectArray;

public class GSM09 {
	public static void main(String[] args) {
        // å-����+�ʱ�ȭ->BookVO()
		BookVO vo1=new BookVO("�ڹ�1", 25000, "ȫ�浿");
		BookVO vo2=new BookVO("�ڹ�2", 25000, "ȫ�浿");
		BookVO vo3=new BookVO("�ڹ�3", 25000, "ȫ�浿");
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
