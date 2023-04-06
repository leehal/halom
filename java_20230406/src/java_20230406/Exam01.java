package java_20230406;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		
		int kor =0;
		int eng =0;
		int math =0;
		int total =0;
		double average =0;
		// int kor, emg, math, total로 한 줄 정리 가능
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("국어 점수를 입력하세요. : ");
		kor = scanner.nextInt(); //정수 입력이라 이렇게만 해도 나옴
		System.out.println("영어 점수를 입력하세요. : ");
		eng = scanner.nextInt(); // 위에 형태를 정해주지 않았다면 여기서 eng 앞에 int를 써서 하는 것도 가능
		System.out.println("수학 점수를 입력하세요. : ");
		math = scanner.nextInt();
		
		total = kor + eng + math;
		average = total/3.0; //3.0으로 하는 이유는 정수라 실수가 잘리지 않게 하기위해
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
		System.out.printf("평균 : %.2f\n" + average); 
		//printf는 출력하면서 형태를 변화하겠단 의미, %.2는 소수점 2자리까지 출력, \n은 줄바꿈
		
		
		// String input = scanner.nextint(); 문자열을 할 때만 string 필요 nextLine이 아니면 안씀
		//String input = scanner.nextLine();
		//int num = Integer.parseInt(input); 입력받은 문자열을 숫자로 변환하기
		
		
		
		
		
		
		
		

	}

}
