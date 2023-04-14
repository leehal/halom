package ex08;

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
import java.util.*;
public class Exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		String a = sc.nextLine();
		
		System.out.println("숫자를 입력하세요");
		int b = sc.nextInt();
		
		int c = (int)(Math.random()*10+1);
		System.out.println(c);
		int sum=0;
		
		int [][] d= new int[b][b];
		
		for(int j=0; j<b; j++) {
			
		for(int i=0; i<b; i++) {
			 sum += c; 
			 System.out.print(sum+", ");
		}
		System.out.println();
		
		}	
		
	}
	
}
