package ex02;

public class A {
	class B{
		int field = 1;
		void test(){}
		
//		static void test2() {} //17버전부터 가능
//		static int field2 = 1;
		
	B(){
	System.out.println("B객체 생성");
	}
	}
	class C{
		C(){
			System.out.println("C객체 생성");
		}
	}
	B field =new B();
	C field2 =new C();
	A(){
		B b = new B();
		System.out.println("A객체 생성");
	}
	void method() {
		B b=new B();
	}
	

}
