package bit.gsm;
// 리모콘의 기능 정의
public interface RemoCon {
   public int MAXCH=100; // final static
   public int MINCH=1;
   public abstract void chUP();
   public void chDOWN();
   public void internet();
}
