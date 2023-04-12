package ex06;

import java.util.*;
public class Exam02 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final int max = 3;
		int sum =0;
		double avg = 0;
		int [] 조4 =new int[max];
		
		for(int i=0; i<max; i++) {
			조4[i] = (int)(Math.random()*50)+51;
		}
		for(int i=0; i<max; i++)
			sum += 조4[i];
		avg = sum/3.0;
		
		for(int i=0; i<max; i++)
			System.out.println(조4[i] + ", ");
		
		System.out.println();
		System.out.println(sum + ", " + avg);
		
		/*int a = (int)(Math.random()*50)+51;
		int b = (int)(Math.random()*50)+51;
		int c = (int)(Math.random()*50)+51;
		
		int s= a+b+c;
		int d= s/3;		
		
		System.out.println("합 : "+s);
		System.out.println("평균 : "+d);
		
		System.out.println("내 점수 : "+a);*/
		
		
		
	
}

}
