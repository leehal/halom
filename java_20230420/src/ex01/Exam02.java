package ex01;

class A{
	int a;
	void func() {
		System.out.println("A-a: "+a);
	}
}
class B extends A{
	int a=20;
	void func2() {
		System.out.println("B -a: "+a);
	}
}
public class Exam02 {

	public static void main(String[] args) {
		
		B b=new B();
		System.out.println(b.a);

	}

}
