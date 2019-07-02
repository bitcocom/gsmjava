import bit.gsm.BookVO;
public class GSM01 {
	public static void main(String[] args) {
        //syso + [Ctrl+SpaceBar]
		//System.out.println("Hello Java");
		// 변수, 자료형(DataType), 할당(=) : 프로그래밍의 3대요소
		int a=10;
		System.out.println(a);
		
		// 책(Object)->만들어 사용해라-->class
		BookVO b=new BookVO();
		b.setTitle("자바");
		b.setPrice(12000);
		b.setName("홍길동");
		System.out.println(b.toString());
	}
}
