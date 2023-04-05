package ex01;

import java.util.Scanner;
import java.util.Scanner.*;

public class Exam04 {

	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		int hour = 0;
		int minute = 0;
		int second = 0;
		int sum = 0;
		
		sum = num/60;
		hour = sum/60;
		minute = sum%60;
		second = num%60;
		
		/*int second = num%60;
		int hour = num/3600;
		int minute = num%3600;*/
		
		System.out.println("시 : " + hour);
		System.out.println("분 : " + minute);
		System.out.println("초 : " + second);
		
		
	}

}
