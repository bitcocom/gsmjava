import bit.gsm.MyUtil;
public class GSM10 {
	public static void main(String[] args) {
		/*
		 * MyUtil my=new MyUtil(); int v=my.calc(); System.out.println(v);
		 */
		// 클래스를 사용하는 시점에서 자동으로 메모리에 로딩된다.
		//int v=MyUtil.calc();
	    //MyUtil my=new MyUtil(); 
		int v=MyUtil.calc();
		System.out.println(v);		
		// System sys=new System();  --> private System(){   }
	}
}
/*
 JVM 구동 : java.exe(실행명령어) : C:\java>java GSM10
 - 1. 클래스가 어디에 있는지 찾는다.(현제디렉토리에서 찾는다-->classpath(환경변수))
 - classpath=.;C:\tmp
 - 2. 객체생성을 해야한다.-->new(X)
 - static키워드가 있는 멤버들을 찾아서 자동으로 메모리에 로딩한다.
   3. main()메서드를 호출-->Method Area->static zone
   4. static area에 메인 메서드가 push되고 실행된다.....
    
 [JVM사용하는 메모리 모델]
  Heap Area   Method Area                  [Call Stack Frame Area]  Literal Pool(문자열상수)  
 |      |     |       |
 |MyUtil|GSM10| main()|static zone(고정)
         MyUtil|calc()|
              ---------
              |       |
              | calc()|none-static zone pc-> |_calc()_|
              |       |                      | main() |my  , v
                                             ----------
*/