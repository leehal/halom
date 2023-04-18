package ex9;
//오버로딩
// 1. 함수이름이 같아야 함 2. 매개변수 타입아나 갯수가 달라야 함
class Member{
	int func(int n) {
		return n;
	}
	double func(double d) {
		return d;
	}
	String func(String str) {
		return str;
	}
	int func(int n1,int n2) {
		return n1+n2;
	}
}
public class Exam05 {
	public static void main(String[] args) {
		
	Member m= new Member();
	
	System.out.println(m.func(10,2));

}
}