package bit.gsm;
public class MyUtil {
	// 인스턴스메서드
	// 클래스메서드(static)
	private MyUtil() {
		
	}
	public static int calc() {
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		return sum;		
	}
	public static int calc1() {
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		return sum;		
	}
}
