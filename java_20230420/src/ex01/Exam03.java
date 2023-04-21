package ex01;

class B{
	void fun1() {}
}
class K extends B{
	void fun2() {}
}
public class Exam03 {

	public static void main(String[] args) {
		B b= new K();
		K kk = (K)b;
		kk.fun2();
	}

}
