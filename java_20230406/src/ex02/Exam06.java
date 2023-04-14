package ex02;

//성별, 나이 입력 ==> 성별: 남, 나이: 20대 이상일 때 참이면 군대 거짓이면 안감

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		String sex = sc.nextLine();
		
		int age = sc.nextInt();
		
		
		
		if(sex.equals("남자")) { // 숫자는 == 이 가능하나 문자 비교는 equals를 사용해야 함
			if(age>=20)
				System.out.println("군대");
			else
			System.out.println("면제");
		}else 
			System.out.println("면제");
		
			
		System.out.println("프로그램 종료.");
		
		
		
		

	}

}
