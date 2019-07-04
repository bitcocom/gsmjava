import bit.gsm.Animal;
import bit.gsm.Cat;
import bit.gsm.Dog;

public class GSM04 {
	public static void main(String[] args) {
      // Dog, Cat 클래스를 저장할 [배열]을 생성하시오.
	  Animal[] ani=new Animal[2]; // 2. 다형성배열
	  ani[0]=new Dog();
	  ani[1]=new Cat();
	  // 반복문
	  for(int i=0;i<ani.length;i++) {
		    ani[i].eat();
		    if( ani[i] instanceof Cat) {
		    	((Cat)ani[i]).night();
		    }
	  }	  
	}

}
