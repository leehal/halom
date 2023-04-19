package ex01;

class Bag{
	int capacity;
	SunCream sun;
	
	public Bag() {
		System.out.println("Bag()");
	}
	void move() {
		System.out.println("가방 옮기기");
	}
}

class SunCream {
	int vol;
	public SunCream() {
		System.out.println("SunCream()");
	}
	void cover() {
		System.out.println("선크림 바르기");
	}
}

public class Exam01 {

	public static void main(String[] args) {
		
	Bag bg = new Bag();	
	bg.move();
	
	bg.sun =new SunCream();
	bg.sun.cover();

	}

}
