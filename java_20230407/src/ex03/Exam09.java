package ex03;
//규율은 날 자유롭게 만든다..............................
//학점구하기

import java.util.*;
public class Exam09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("숫자입력> ");
		//int a = sc.nextInt();
		//int b = sc.nextInt();
		
		
		
	//1)a는 점수	
		/*if(a>=50)
			System.out.println("50이상");
		else
			System.out.println("50미만");*/
		
	//2	a는 숫자
		/*if(a%3==0)
			System.out.println("3의 배수");
		else
			System.out.println("3의 배수 아님");*/
		
	//3	a = 학년 b = 점수
		/*switch(a) {
		case 1: case 2: case 3:
			if(100>=b && b>=60)
				System.out.println("합격");
			else if(b<60)
				System.out.println("불합격");
			else
				System.out.println("다른 숫자 입력금지");
			break;
		case 4:
			if(100>=b && b>=70)
				System.out.println("합격");
			else if (b<70)
				System.out.println("불합격");
			else
				System.out.println("다른 숫자 입력금지");
			break;*/
				
		//4 임의의 숫자 a, b, c
		/*int c = sc.nextInt();
		
		int max, min;
		
		if (a>b && a>c)
			max = a;
		else if(b>a &&b>c) 
			max =b;
	    else 
			max =c;
			System.out.println("최댓값은 " + max);
		
		if (a<b && a<c)
			min = a;
		else if(b<a &&b<c) 
			min =b;
		else 
			min =c;
			System.out.println("최소값은 " + min);
			
		System.out.println("세 수의 합은 "+(a+b+c));
		System.out.println("세 수의 평균은 "+ (double)(a+b+c)/3);*/
		
		//5 b 잠깐 //해주기 임의의 숫자 a
		/*if(a>0)
			System.out.println("양수");
		else if(a==0)
			System.out.println("0");
		else
			System.out.println("음수");*/
		
		//6 a,b 둘 다 // 처리
		System.out.println("문자 입력>");
		String ch = sc.nextLine();
		
		char c2 = ch.charAt(0);
		
		if(c2 <= 'z' && c2 >= 'a')
			System.out.println("첫문자는 소문자");
		else if(c2 >= 'A' && c2 <= 'Z')
			System.out.println("첫문자는 대문자");
		
		
		
			
			
		
			
		
		}	
	

}
