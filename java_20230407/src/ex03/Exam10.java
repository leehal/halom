package ex03;
//규율은 날 자유롭게 만든다..............................
//학점구하기

import java.util.*;
public class Exam10 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수입력> ");
		int jumsu = sc.nextInt();
		
		
		switch(jumsu/10) {
		case 10 : case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
		case7 :
			System.out.println("C");
			break;
		case 6 :
			System.out.println("D");
			break;
		case 5 : case 4 :case 3 :case 2: case 1 :case 0 :
			System.out.println("F");
			break;
		default :
			System.out.println("0~100 외의 다른 숫자 금지");
		
		
		}

		System.out.println("프로그램종료");

}
}