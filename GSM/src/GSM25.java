import java.io.*;
import java.util.ArrayList;
import java.util.List;

import gsm.model.MemberVO;
public class GSM25 {                      // JVM
	public static void main(String[] args) throws Exception {
       
		FileReader fr=new FileReader("member.txt");
		BufferedReader br=new BufferedReader(fr);
		String line=null;
		List<MemberVO> list=new ArrayList<MemberVO>();
		while((line=br.readLine())!=null) {
			System.out.println(line);
			String[] sp=line.split("\t");       // "50"->50           
			MemberVO vo=new MemberVO(sp[0], Integer.parseInt(sp[1]), sp[2], sp[3], sp[4]);
		    list.add(vo);	
		}//
		// 이름을 기준으로 오름차순 정렬 ?
        for(int i=0;i<list.size()-1;i++) {
        	for(int j=i+1;j<list.size();j++) {
        		if(list.get(i).getName().compareTo(list.get(j).getName())>0) {
        			MemberVO tmp=list.get(i);
        			list.set(i,list.get(j));
        			list.set(j,tmp);
        		}//
        	}//
        }//
        // 출력
        // 결과를 파일에 저장하시오.
        FileWriter fw=new FileWriter("sorted.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        for(MemberVO vo : list) {
        	System.out.println(vo);
        	bw.write(vo.getName()+"\t"+vo.getAge()+"\t"+vo.getAddr()+"\t"+vo.getTel()+"\t"+vo.getEmail());
            bw.newLine(); // bw.write("\n")
        }        
        bw.close();
        System.out.println("저장완료");
	}
}


