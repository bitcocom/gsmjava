import bit.gsm.Animal;
import bit.gsm.Cat;
import bit.gsm.Dog;

public class GSM02 {
	public static void main(String[] args) {
             Cat c=new Cat(); //Cat.java, Cat.class
             c.eat();
             
             Dog d=new Dog(); //Dog.java, Dog.class
             d.eat();
            
            // 다형성 -->[Object Casting]
            // 상위클래스가 동일한 메세지로 하위클래스를 서로다르게 구동하는 객체지향 원리
            // 1. 상속전제
            // 2. Upcasting(업케스팅) : 부모타입으로 객체를 받아야한다.
            // 3. Override(재정의)
            // 4. 동적바인딩원리 
            //Dog.class
            Animal ani=new Dog(); 
            ani.eat();// ?
            
            //Cat.class
            ani=new Cat();      // upcasting
            ani.eat();// ?
            ((Cat)ani).night(); // downcasting
	}
}
