package ex9;

class Member {
	int age; //인스턴스 변수
	static int num; // 클래스 변수,정적변수,공유변수
}

public class Exam04 {

	g
		
		Member a = new Member();
		a.age=10;
		a.num = 30;
		
		Member.num = 100; //객체 생성 X도 가능함. 하지만 어디 num인지 모르니 class 써줘야 함
		

	}

}
