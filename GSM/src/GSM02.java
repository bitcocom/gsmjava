public class GSM02 {
	public static void main(String[] args) {
        //int[] a=new int[3];
		// 1~10까지의 총합
		int[] a= {1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for (int i = 0; i < a.length; i++) {
		    sum = sum + a[i]; 	
		}
        System.out.println("sum=" + sum);
	}
}
