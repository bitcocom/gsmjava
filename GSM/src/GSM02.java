import bit.gsm.Animal;
import bit.gsm.Cat;
import bit.gsm.Dog;

public class GSM02 {
	public static void main(String[] args) {
             Cat c=new Cat(); //Cat.java, Cat.class
             c.eat();
             
             Dog d=new Dog(); //Dog.java, Dog.class
             d.eat();
            
            // ������ -->[Object Casting]
            // ����Ŭ������ ������ �޼����� ����Ŭ������ ���δٸ��� �����ϴ� ��ü���� ����
            // 1. �������
            // 2. Upcasting(���ɽ���) : �θ�Ÿ������ ��ü�� �޾ƾ��Ѵ�.
            // 3. Override(������)
            // 4. �������ε����� 
            //Dog.class
            Animal ani=new Dog(); 
            ani.eat();// ?
            
            //Cat.class
            ani=new Cat();      // upcasting
            ani.eat();// ?
            ((Cat)ani).night(); // downcasting
	}
}
