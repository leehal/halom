package ex06;

class 사람{
	String name = "홍길동";
	int age= 20;
//	public 사람(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
	void info() {
		System.out.println(name+", "+age);
	}
}

class 구본우 extends 사람{
	double weight;
	
//	public 구본우 (String name, int age, double weight) {
//		this.name = name;
//		this.age = age;
//		this.weight = weight;
//	}
	void display() {
//		System.out.println(name+", "+age+", "+weight);
	}
}
class 추명선 extends 사람{
//	String name;
//	int age;
	double height;
	
//	public 추명선 (String name, int age, double height) {
//		this.name = name;
//		this.age = age;
//		this.height = height;
//	}
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
		추명선 추 =new 추명선();
		추.info();
		
		구본우 구 =new 구본우();
		구.age =20;
		구.name ="로이";
		구.weight = 89;
		구.info();
		
		
		박종진 박 = new 박종진();
		
	}

}
