import bit.gsm.Animal;
import bit.gsm.Cat;
import bit.gsm.Dog;

public class GSM05 {
	public static void main(String[] args) {

	   // Animal ani=new Animal(); 부모역할
		Animal ani=new Cat();
		ani.eat();
		ani.move();
		((Cat)ani).night();
		
		ani=new Dog();
		ani.eat();
		ani.move();
	}

}
