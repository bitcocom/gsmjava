import bit.gsm.Animal;
import bit.gsm.Cat;
import bit.gsm.Dog;

public class GSM04 {
	public static void main(String[] args) {
      // Dog, Cat Ŭ������ ������ [�迭]�� �����Ͻÿ�.
	  Animal[] ani=new Animal[2]; // 2. �������迭
	  ani[0]=new Dog();
	  ani[1]=new Cat();
	  // �ݺ���
	  for(int i=0;i<ani.length;i++) {
		    ani[i].eat();
		    if( ani[i] instanceof Cat) {
		    	((Cat)ani[i]).night();
		    }
	  }	  
	}

}
