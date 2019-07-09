package bit.gsm;
// 책->상태(제목, 가격, 지은이, 출판사, 페이지, )+행위
import java.lang.*;// 생략
public class BookVO extends Object{  //
    private String title;
    private int price;
    private String name;
	public BookVO() { // 디폴트생성자
	   // 객체를 생성하는 동작 생략...
	   super();// new Object()
   }
	// 생성자 오버로딩(overloading)
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
