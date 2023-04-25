package ex02;

public class AExam {
	
	public static void main(String[] args) {
		A a= new A();
		
		A.B b= a.new B();
		
		A.B b= new A.B();
		A.C c= new A.C();
 	}

}
