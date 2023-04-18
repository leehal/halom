package ex09;

 class Parent{
	public String nation;
	public int nation2;
	public Parent() {
		this(2);
		System.out.println("Parent() call;");
	}
	public Parent(String nation) {
		this.nation= nation;
		System.out.println("Parent(String nation) call");
	}
	public Parent(int nation) {
		this.nation2= nation;
		System.out.println(nation2);
	}
}
 class Child extends Parent{
	public String name;
	
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	public Child(String name) {
		this.name = name;
		System.out.println("Chile(String name) call");
	}
}

public class Exam01 {

	public static void main(String[] args) {
		
		Child ch = new Child();
	}

}
