package ex01;
//열거형 
enum Animal{
	DOG,CAT
}
enum Person{
	MAN,WOMAN
}

public class SimpleEnum2 {

	public static void main(String[] args) {
		
		who(Person.WOMAN.ordinal());
	}
	public static void who(int p) {
		switch(p) {
		case 0:
			System.out.println("남자");
			break;
		case 1:
			System.out.println("여자");
			break;
		default:
			System.out.println("자유");
		}
	}
}
