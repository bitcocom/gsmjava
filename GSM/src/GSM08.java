import java.util.ArrayList;

import bit.gsm.IntArray;

public class GSM08 {
	public static void main(String[] args) {
      // �迭�� ����
	  // 1. ����     : ������
		int[] a=new int[3];
      // 2. ����(����)    : add()
		a[0]=10;
		a[1]=10;
		a[2]=10;
	  // 3. ��������(���) : get()	
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
