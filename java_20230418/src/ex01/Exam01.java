package ex01;

class Member{
	String name;
	int age;
	int num;
	static int ban;
	static String ac;
	
	void info() {
		age = ban;
		ban = num;
	}
	
	static void sInfo() {
		ban = 200;
		age = 20;
	}
}
//정적변수, 정적메소드는 공유자원이면서 지들끼리만 데이터를 주고 받을 수 있다.
public class Exam01 {

	public static void main(String[] args) {
		
		Member m = new Member();
		
		System.out.println(m.age); 
		System.out.println(m.num); 
		System.out.println(m.ban); 

	}

}
