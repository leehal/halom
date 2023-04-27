package ex01;

class Card{
	void info() {
		System.out.println("card()");
	}
}

public class Exam01 {

	public static void main(String[] args) {
		
		Class cObj = new Card().getClass();
		Class bObj = Card.class;
		Class aObj = Class.forName("ex01.card");
		
		System.out.println(cObj);
		System.out.println(bObj);
		System.out.println(aObj);
		
	}

}
