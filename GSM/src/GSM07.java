import bit.gsm.*;

public class GSM07 {
	public static void main(String[] args) {
      // A클래스를 사용하기 위해서 객체를 생성(upcasting)
	  Object obj=new A();
	  ((A)obj).ptr();
	  
	  A a=new A();
	  display(a);
	  B b=new B();
	  display(b);	  
	}
	private static void display(Object obj) {
	    if(obj instanceof A) {
		    ((A)obj).ptr();
	    }else {
			((B)obj).ptr();
		}
	}
}
