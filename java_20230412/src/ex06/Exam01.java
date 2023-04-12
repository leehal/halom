package ex06;

import java.util.*;
public class Exam01 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num =0;
		
		int a = (int)(Math.random()*50)+51;
			
		System.out.println("성진님 점수");
		int b = sc.nextInt();
		
		System.out.println("현호님 점수");
		int c = sc.nextInt();
		
		int s = a+b+c;
		int d=(a+b+c)/3;
		
		System.out.println("합 : "+s);
		System.out.println("평균 : "+d);
		
		System.out.println("내 점수 : "+a);
		
		
		
	
}

}
