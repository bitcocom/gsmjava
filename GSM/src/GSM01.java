import bit.gsm.BookVO;
public class GSM01 {
	public static void main(String[] args) {
        //syso + [Ctrl+SpaceBar]
		//System.out.println("Hello Java");
		// ����, �ڷ���(DataType), �Ҵ�(=) : ���α׷����� 3����
		int a=10;
		System.out.println(a);
		
		// å(Object)->����� ����ض�-->class
		BookVO b=new BookVO();
		b.setTitle("�ڹ�");
		b.setPrice(12000);
		b.setName("ȫ�浿");
		System.out.println(b.toString());
	}
}
