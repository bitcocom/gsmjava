import bit.gsm.Animal;
import bit.gsm.Cat;
import bit.gsm.Dog;
public class GSM03 {
	public static void main(String[] args) {
       // Dog, Cat
	   Cat c=new Cat();
	   display(c);
	   
	   Dog d=new Dog();
	   display(d);
	}
	private static void display(Animal d) { // 1. 다형성인수
		d.eat();
		if(d instanceof Cat) {
		   ((Cat)d).night();
		}
	}
	
	
}
