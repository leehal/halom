package ex04;

import java.util.Scanner;

public class Exam04 {
//1~100 홀수의 갯수
	public static void main(String[] args) {
     
		System.out.println("두 개의 숫자 입력");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = 0;
		
		for(int i=num; i<=num2; i++)
			sum += i;
		System.out.println(sum);
			
		
	}

}
