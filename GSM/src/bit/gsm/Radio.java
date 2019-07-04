package bit.gsm;
public class Radio implements RemoCon {
	@Override
	public void chUP() {
		System.out.println("Radio_chUP");
	}
	@Override
	public void chDOWN() {
		System.out.println("Radio_chDOWN");
	}
	@Override
	public void internet() {
		System.out.println("internet이 지원 않됨");
	}

}
