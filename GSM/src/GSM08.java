import java.util.ArrayList;

import bit.gsm.IntArray;

public class GSM08 {
	public static void main(String[] args) {
      // 배열의 동작
	  // 1. 생성     : 생성자
		int[] a=new int[3];
      // 2. 저장(삽입)    : add()
		a[0]=10;
		a[1]=10;
		a[2]=10;
	  // 3. 가져오기(얻다) : get()	
		int x=a[0];
		System.out.println(x);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		//IntArray arr=new IntArray(3);
		ArrayList<Integer> arr=new ArrayList<Integer>(1); // Object[]
		arr.add(10);
		arr.add(10);
		arr.add(10);		
		for(int i=0; i<arr.size();i++) {
			System.out.println(arr.get(i));
		}		
	}
}
