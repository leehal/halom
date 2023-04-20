package ex02;
class A{
	int a=10;
	
	void func(int b) {
		System.out.println(a+b);
	}
}
class B extends A{
	int a=10;
	
	void func(int b) {
		System.out.println(a-b);
	}
}
class C extends B{
	int a=10;
	
	void func(int b) {
		System.out.println(a*b);
	}
}

public class Exam01 {

	public static void main(String[] args) {
		
		B bc = new C();
		bc.func(3);
		
		

	}

}
