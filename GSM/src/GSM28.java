import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class GSM28 {
	public static void main(String[] args) {
     // Jsoup API : HTMLÆÄ½Ì ¹æ¹ý
     String url="https://sum.su.or.kr:8888/bible/today";
     try {
		Document doc=Jsoup.connect(url).post();
	    //System.out.println(doc.toString());
		Element bible_text=doc.select(".bible_text").first();
		System.out.println(bible_text.text());
		
		Element bibleinfo_box=doc.select("#bibleinfo_box").first();
		System.out.println(bibleinfo_box.text());
		
		Elements liList=doc.select(".body_list > li");
		for(Element  li: liList) {
			System.out.print(li.select(".num").first().text()+":");
			System.out.println(li.select(".info").first().text());
		}
	 } catch (Exception e) {
		e.printStackTrace();
	 }		
	}
}
