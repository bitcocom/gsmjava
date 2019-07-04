package bit.gsm;

public class TV  implements  RemoCon{
	public int curch=80;
	@Override
	public void chUP() {
	   if(curch  < RemoCon.MAXCH) {	
		  curch++;
	      System.out.println("TV_chUP:"+curch);	      
	   }else {
		  curch=0;
	   }
	}
	@Override
	public void chDOWN() {
		System.out.println("TV_chDOWN");
	}
	@Override
	public void internet() {
		System.out.println("internet..");
	}

}
