package ex04;

import java.util.Scanner;

public class Exam06 {
//1~100 홀수의 갯수
	public static void main(String[] args) {
     
		int sum=0; 
		int sign=0;
		int tmp=0;
		
		for(int i=1 ; ; i++, sign =-sign) {
			 tmp =sign*i;
			 sum += tmp;
			 
			
			 
			 if(sum>=100)break;
				 
			
	}
		System.out.println("tmp : "+tmp+" sum : "+sum);
}
}

