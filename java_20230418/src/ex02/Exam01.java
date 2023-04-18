package ex02;

class Member{
	private String name;
	private int age;
	
	
	public Member(String n, int a) {
		name = n;
		age =a;
	}
	void display() {
		System.out.println(name+", "+age);
	}
	void setData(String n, int a) {
		name = n;
		if(a>=0 && a<=120)
			age =a;
		else
			age =1;
	}
	public Member() {
		name = "미정의";
		age =0;
	}
	public Member(String n) {//s4 출력을 위해 만든 생성자
		name =n;
	}	
}
//정적변수, 정적메소드는 공유자원이면서 지들끼리만 데이터를 주고 받을 수 있다.
public class Exam01 {

	public static void main(String[] args) {
		
		Member s1 = new Member("구본우",26);
		
		Member s2 = new Member("추명선",26);
		
		s1.display();
		s2.display();
		
		Member s3 = new Member();//와 타입이 같은 생성자가 있어야 오류가 안남.()속의 타입이 같은,
		s3.display();
		Member s4 = new Member("이성진");
		s4.display();

	}

}
