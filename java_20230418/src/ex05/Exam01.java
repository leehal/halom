package ex05;

class 사람{
	String name;
	int age= 20;
	
	public 사람(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void info() {
		System.out.println(name+", "+age);
	}
}

class 구본우 extends 사람{
	double weight;
	
	public 구본우(String name, int age, double weight) {
		super(name,age);
		this.weight= weight;
	}
	void display() {
//		System.out.println(name+", "+age+", "+weight);
	}
}
class 추명선 extends 사람{
	double height;
	
	public 추명선 (String name, int age, double height) {
		super(name,age);
		this.height = height;
	}
	void display() {
//		System.out.println(name+", "+age+", "+height);
	}
}
class 박종진{
//	String name;
//	int age;
	String grade;
	
//	public 박종진 (String name, int age, String grade) {
//		this.name = name;
//		this.age = age;
//		this.grade = grade;
//	}
	void display() {
//		System.out.println(name+", "+age+", "+grade);
	}
}

public class Exam01 {

	public static void main(String[] args) {
		추명선 추 =new 추명선("사랑이",2,10);
		추.info();
		
		구본우 구 =new 구본우("로이",11,120);
		구.info();
		
		
		박종진 박 = new 박종진();
		
	}

}
