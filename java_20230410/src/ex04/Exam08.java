package ex04;

import java.util.Scanner;

public class Exam08 {
//for문 무한 반복 처리
	public static void main(String[] args) {
		
		
		int num=0;
		int i=0;
		
		for(i=1;  ; i++) {
			if(i%2==0)
				num-=i;
			else
				num+=i;
		if(num>=100)
			break;
		}		System.out.println("i : "+ i+ "num : "+num);
}
	
}