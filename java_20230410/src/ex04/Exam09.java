package ex04;

import java.util.Scanner;

public class Exam09 {
//for문 무한 반복 처리
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int sum=0;
		
		for(;;) {
		System.out.println("----------------------------------");
		System.out.println("예금 | 출금 | 잔고 | 종료 ");
		System.out.println("----------------------------------");
		
		int num =sc.nextInt();
		switch(num) {
		
		case 1 :
			System.out.println("예금>>");
			int m=sc.nextInt();
			sum += m;
			break;
		case 2 :
			System.out.println("출금>>");
			 int n=sc.nextInt();
			sum-=n;
			break;
		case 3 : 
			System.out.println("잔고>>" + sum);
			break;
			
		}
		if(num==4) 
			System.out.println("종료");
		break;
		
		
}
}
}