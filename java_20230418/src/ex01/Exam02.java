package ex01;

class Member{//private는 정보를 함수로만 접근 가능하게 함. 그래서 s1.name 변수 만들어서 접근 불가능
	private String name;//안정성이 높아짐
	private int age;
	
	void display() {
		System.out.println(name=", "+age);
	}
	
	void setData(String n, int a) {//이렇게 함수로 만들어 접근해야함.
		name = n;
		age = a;
	}
}
//정적변수, 정적메소드는 공유자원이면서 지들끼리만 데이터를 주고 받을 수 있다.
public class Exam02 {

	public static void main(String[] args) {
		
		Member s1 = new Member();
		s1.setData("구본우",26);
		
		Member s2 = new Member();
		s2.setData("추명선", 26);
		
		s1.display();
		s2.display();

	}

}
