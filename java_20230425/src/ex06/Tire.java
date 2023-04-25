package ex06;

public class Tire {
	
	public void roll() {
		System.out.println("바퀴가 구르다");
	}

}

class Test extends Tire{
	public void roll() {
		System.out.println("Tire 상속받아 재정의");
	}
	
}
