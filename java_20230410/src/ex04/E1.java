package ex04;

import java.util.Scanner;

public class E1 {
//for문 무한 반복 처리
	public static void main(String[] args) {
		
		int sum =0;
		int count =0;
		int i =0;
		for( i =(-3); i <=100; i++ ) {
			if(i%2==0) {
				sum +=i;
		       count++;
			}
			
		}		
		System.out.println(sum+ " , "+count);
}
	
}