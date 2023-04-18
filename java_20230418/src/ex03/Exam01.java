package ex03;

class Member{
	private String name;//this.name은 여기의 name을 가리킴
	private int age;
	
	//this의 용도: 지역변수와 멤버변수가 충돌 날 때 this를 붙이면 멤버변수를 의미
	//this의 용도: 다만, 개발자가 생성자을 생성하지 않는 경우에만 만들어 줌
	//생성자==> 반환타입X, 클래스 이름과 같다, 오버로딩이 가능, 초기화 기능을 가지고 있ㅇ,ㅁ
	public Member(String name, int age) {//()안의 name은 지역변수
		this.name = name;
		this.age =age;
	}
	public Member() {
		this("미정의",1);//()의 타입을 받아 줄 수 있는 생성자를 찾음.
	}
	 Member(String name) {//s4 출력을 위해 만든 생성자
		this(name,1);
	}	
	 void display() {
		 System.out.println(name+", "+age);
	 }
	 void setData(String name, int age) {
		 this.name = name;
		 if(age>=0 && age<=120)
			 this.age =age;
		 else
			 this.age =1;
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
