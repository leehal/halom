package ex9;

class Student{
	
	String name;
	String address;
	int age;
	static int count;// static이 붙으면 개별적X 공용임
	void displyInfo() {
		//info(); 가능, 클래스변수는 진즉에 생성되었음. 객체가 없어도 존재하고 있음
		count++;
		System.out.println(name+", "+age+", "
				+address+",현재학생수 : "+count);
	}


static void info() {
	count++;
	//add++;>> 불가능!! 객체가 생성된 후 생성됨. 아직 생성되지 않아서 ++할 수 없음.
}

public class Exam03 {

	public static void main(String[] args) {
		
		
		Student kim = new Student();
		kim.name = "김씨요";
		kim.address = "수원이요";
		kim.age = 20;
		
		Student park = new Student();
		park.name = "박씨요";
		park.address = "청주요";
		park.age = 25;
		
		Student lee = new Student();
		Student hong = new Student();
		
		kim.displyInfo();
		park.displyInfo();
		lee.displyInfo();
		hong.displyInfo();
		
	}

}
}
