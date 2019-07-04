package bit.gsm;
public class IntArray {
   private int size; // 0
   private int[] arr;
   public IntArray() {
	   //arr=new int[10];
	   this(10);
   }
   public IntArray(int init) { // new IntArray()
	   arr=new int[init];
   }
   // ÀúÀå
   public void add(int data) {
	   arr[size++]=data;
   }
   public int get(int index) {
	   return arr[index];
   }
   public int size() {
	   return size;
   }
}
