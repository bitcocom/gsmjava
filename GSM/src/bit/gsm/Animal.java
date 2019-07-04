package bit.gsm;
public abstract class Animal { // 추상클래스
   public abstract void eat(); // 장애메서드(추상메서드)
   public void move() {
	   System.out.println("무리를 지어서 이동한다"); // 구현메서드
   }
}
