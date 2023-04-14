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
public class Exam01 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		//add(10,20);// 다 실행 후 n1과 n2가 합해져 30이 됨 근데 어디 저장되긴 하는데 찾을 수 X 무의미한 변수가 되어서 int형이 와줘야함
		
		//1. int num =add(10,20);
		add(10,20);
		System.out.println("프로그램 끝"+", ");

	}
//	 2     반환타입 함수이름 매개변수
	static int convertInt(double f) {
		int result = (int)f;
		return result;
	}
// 1	
	/*static int add(int n1,int n2 ){
		System.out.println("add함수 시작...");
		int result = n1+n2;//add 30 된 후 n1, n2 값 사라짐
		return result;
	}*/
// 3	
	static void add(int num1,int num2) {
				
		System.out.println("더하기 : "+ (num1+num2));
		
	}
	
}
