package ex03;

//성적을 입력 받아서 학점 구하는 프로그램 작성
// 90점 이상 A 80 이상 B, 70 이상 C, 60 이상 D, 나머지 F

import java.util.Scanner; 

public class Exam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("성적입력>");
		int number = sc.nextInt();
		
		if(number>=90)
		System.out.println("A힉점");
		else if(number>=80)
			System.out.println("B힉점");
		else if(number>=70)
			System.out.println("C힉점");
		else if(number>=60)
			System.out.println("D힉점");
		else
			System.out.println("F힉점");
		
		
		System.out.println("프로그램 종료");
		
		//else 계속 나열 가능!
	}

}
