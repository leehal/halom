package ex01;
//열거형 
enum Scale{
	DO,RE,MI,FA
}

public class SimpleEnum {

	public static void main(String[] args) {
		System.out.println(Scale.DO.ordinal());//순서숫자
		System.out.println(Scale.DO.name());//이름
		System.out.println(Scale.DO);

	}

}
