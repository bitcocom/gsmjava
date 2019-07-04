package bit.gsm;
public class Dog extends Animal {
	// 다형성을 보장...
	@Override
	public void eat() {
		System.out.println("개처럼먹다");
	}
}
