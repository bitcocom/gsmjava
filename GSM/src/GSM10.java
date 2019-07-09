import bit.gsm.MyUtil;
public class GSM10 {
	public static void main(String[] args) {
		/*
		 * MyUtil my=new MyUtil(); int v=my.calc(); System.out.println(v);
		 */
		// Ŭ������ ����ϴ� �������� �ڵ����� �޸𸮿� �ε��ȴ�.
		//int v=MyUtil.calc();
	    //MyUtil my=new MyUtil(); 
		int v=MyUtil.calc();
		System.out.println(v);		
		// System sys=new System();  --> private System(){   }
	}
}
/*
 JVM ���� : java.exe(�����ɾ�) : C:\java>java GSM10
 - 1. Ŭ������ ��� �ִ��� ã�´�.(�������丮���� ã�´�-->classpath(ȯ�溯��))
 - classpath=.;C:\tmp
 - 2. ��ü������ �ؾ��Ѵ�.-->new(X)
 - staticŰ���尡 �ִ� ������� ã�Ƽ� �ڵ����� �޸𸮿� �ε��Ѵ�.
   3. main()�޼��带 ȣ��-->Method Area->static zone
   4. static area�� ���� �޼��尡 push�ǰ� ����ȴ�.....
    
 [JVM����ϴ� �޸� ��]
  Heap Area   Method Area                  [Call Stack Frame Area]  Literal Pool(���ڿ����)  
 |      |     |       |
 |MyUtil|GSM10| main()|static zone(����)
         MyUtil|calc()|
              ---------
              |       |
              | calc()|none-static zone pc-> |_calc()_|
              |       |                      | main() |my  , v
                                             ----------
*/