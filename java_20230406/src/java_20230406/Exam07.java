package java_20230406;

//세 정수를 입력받아서 최댓값과 최소값을 구하기

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max, min;
		
		//최대값
		/*if(a>b) {
			if(a>c) max = a;
			else max = c;
		}else {
			if(b>c) max = b;
			else max= c;
		}
		//최소값
		if(a<b) {
			if(a<c) min =a;
			else min =c;
		}else {
			if(b<c) min=b;
			else min= c;
		}*/
			
		if(a>b && a>c)
			max = a;
		else{
			if(b>c) max =b;
			else max = c;
		}
		if(a<b && a<c)
			min = a;
		else{
			if(b<c) min =b;
			else min = c;
		}
		
		System.out.println("최대깂 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("프로그램 종료.");
		
		
		
		

	}

}
