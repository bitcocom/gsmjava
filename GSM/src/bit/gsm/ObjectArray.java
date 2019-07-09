package bit.gsm;
public class ObjectArray {
	   private int size; // 0
	   private Object[] arr;
	   public ObjectArray() {
		   //arr=new int[10];
		   this(10);
	   }
	   public ObjectArray(int init) { // new IntArray()
		   arr=new Object[init];
	   }
	   // ÀúÀå
	   public void add(Object data) {
		   arr[size++]=data;
	   }
	   public Object get(int index) {
		   return arr[index];
	   }
	   public int size() {
		   return size;
	   }    
}