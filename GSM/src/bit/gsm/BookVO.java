package bit.gsm;
// å->����(����, ����, ������, ���ǻ�, ������, )+����
import java.lang.*;// ����
public class BookVO extends Object{  //
    private String title;
    private int price;
    private String name;
	public BookVO() { // ����Ʈ������
	   // ��ü�� �����ϴ� ���� ����...
	   super();// new Object()
   }
	// ������ �����ε�(overloading)
	public BookVO(String title, int price, String name) {
		this.title = title;
		this.price = price;
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "BookVO [title=" + title + ", price=" + price + ", name=" + name + "]";
	}	
}
