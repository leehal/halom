package ex03;

public class AExam {
	
	public static void main(String[] args) {
		A a= new A();
		
		A.B b= a.new B();
		
		b.test();
		b.field=10;
		A.B.field2=1;
	}

}