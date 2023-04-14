package ex08;

/*
 * String main(int num){
 * return >> 문자열;
 * }
 * 
 * void : 반환타입, main : 함수명, () : 매개변수 타입
 * {} : 함수가 수행 할 문장
 * 
 * 1. 더하기 : 반환타입 O, 매개변수 2개 O
 * 2. 실수값을 전달하면 실수값을 정수로 변환해서 돌려주는 함수 작성.
 * 3. 더하기2: 반환타입X, 매개변수O (2개)
 * 
 */
public class Exam02 {
//2
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		con(3.5);
		
		System.out.println("프로그램 끝"+", ");
	}
	static void  con(double a) {

		System.out.println((int)a);
	}
	
}
