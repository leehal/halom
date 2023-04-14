package ex08;

import java.util.Scanner;

/*
 * String main(int num){
 * return >> 문자열;
 * }
 * 
 * void : 반환타입, main : 함수명, () : 매개변수 타입
 * {} : 함수가 수행 할 문장
 * 
 * 함수를 호출하면서 인자값 하나 전달(정수)하면 함수는
 * 1부터 전달한 인자값까지 더해서 더한 결과값을 호출함수에게 반환해서 출력
 * 
 */
public class Exam06 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int b = sc.nextInt();
		
		
		
		System.out.println();
		
		System.out.println("프로그램 끝"+", ");
	}
	static void a(int num) {
	   int sum =0;
		//for(int i=1;i<=num;i++)
			// sum += i;
		if(num%2==0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
		//System.out.println(sum);
			
		
	}
	
	
	
	
	
}
