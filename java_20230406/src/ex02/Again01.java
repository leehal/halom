package ex02;

import java.util.Scanner;

public class Again01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어 : ");
		int kor = scanner.nextInt();
		System.out.println("영어 : ");
		int eng = scanner.nextInt();
		System.out.println("수학 : ");
		int math = scanner.nextInt();
		
		int total = kor + eng + math;
		double average = total/3.0;
		
		System.out.println("총점 : " +total);
		System.out.println("평균 : " +average);
		//System.out.println("평균 : " +average);
		
		
	}

}
