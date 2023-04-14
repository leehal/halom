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
public class Exam07 {

	public static void main(String[] args) {
		final int a = 4;
		int[][] sum= new int [a][a];
		int k=0;
		
		for(int i=0;i<sum.length; i++) {
			for(int j=0;j<sum.length;j++) {
			sum[i][j]=k++;
			if(i%2==0) {
			if(k%2==1)
				System.out.print("^");
			else 
				System.out.print("+");
			}
			else {
				if(k%2==0)
					System.out.print("^");
				else 
					System.out.print("+");
			}
				
			}
			System.out.println();
	}
		
		
		
		
	}	
	
}
