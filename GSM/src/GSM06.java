import bit.gsm.Radio;
import bit.gsm.RemoCon;
import bit.gsm.TV;
public class GSM06 {
	public static void main(String[] args) {
       //RemoCon���� TV�� Radio�� ���۽�Ű�ÿ�.
	   RemoCon remo=new TV();
	   for(int i=0;i<30;i++) {
	       remo.chUP();
	   }
	   remo.chDOWN();
	   remo.internet();
	   
	   remo=new Radio();
	   remo.chUP();
	   remo.chDOWN();
	   remo.internet();
	}

}
