package java_20230406;

//나의 이름, 주소, 나이(만으로 입력)를 입력 받아서 출력하는 프로긂 작성 (단, 나이는 +1 해서 출력)

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		String name = sn.nextLine();
		String address = sn.nextLine();
		int age = sn.nextInt();
		
		System.out.println("이름 : "+ name);
		System.out.println("주소 : "+ address);
		System.out.println("나이 : "+ (age+1));
		
		
		

	}

}
