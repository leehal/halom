package ex04;

import java.util.Scanner;

public class Exam07 {
//for문 무한 반복 처리
	public static void main(String[] args) {
		
		int bal =0;
		Scanner sc = new Scanner(System.in);
		
		for(;; ) {
			

			System.out.println("-----------------------------------------");
			System.out.println("1예금 \t2출금 \t3잔고 \t4종료");
			System.out.println("-----------------------------------------");
			
			int num = sc.nextInt();
			switch(num) {
			case 1 :
				System.out.println("선택>1\n예금액 : ");
				bal += sc.nextInt();
			    break;
			case 2 :
				System.out.println("선택>2\n출금액 : ");
				bal -= sc.nextInt();
				break;
			
			case 3 :
				System.out.println("선택>3\n현재잔고 : "+bal);
				break;
}
			if(num==4)
			break;
			
			
}
		System.out.println("종료");
}
}