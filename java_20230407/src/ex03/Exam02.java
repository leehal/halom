package ex03;

//성적을 입력 받아서 학점 구하는 프로그램 작성
// 90점 이상 A 80 이상 B, 70 이상 C, 60 이상 D, 나머지 F

import java.util.Scanner; 

public class Exam02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력>");
		int number = sc.nextInt();
		
		
		if(number>0)
			System.out.println("양수");
		else if(number ==0)
			System.out.println(" 0");
		else 
		System.out.println("음수");
		
		
		
		
		
	}

}
