package gsm.model;
public class MemberVO implements java.io.Serializable{ // 표시, 마크 인터페이스
  private int num; // 기본키(id)
  private String name;
  private int age;
  private String addr;
  private String tel;  
  private String email;
  public MemberVO() {   } // 명시적으로 만들것
  //초기화(생성자)
  public MemberVO(String name, int age, String addr, String tel, String email) {
	super();
	this.name = name;
	this.age = age;
	this.addr = addr;
	this.tel = tel;
	this.email = email;
  }
 public MemberVO(int num, String name, int age, String addr, String tel, String email) {
	super();
	this.num = num;
	this.name = name;
	this.age = age;
	this.addr = addr;
	this.tel = tel;
	this.email = email;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "MemberVO [num=" + num + ", name=" + name + ", age=" + age + ", addr=" + addr + ", tel=" + tel + ", email="
			+ email + "]";
}
 
}
