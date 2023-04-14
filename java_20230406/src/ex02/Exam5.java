package ex02;

//나의 이름, 주소, 나이(만으로 입력)를 입력 받아서 출력하는 프로긂 작성 (단, 나이는 +1 해서 출력)

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		String name = sn.nextLine();
		String address = sn.nextLine();
		int age = sn.nextInt();
		
		
		/*int age = sn.nextInt();
		String name = sn.nextLine();
		String address = sn.nextLine();*/
		//근데 이렇게 하면 실행이 안됨. enter를 삭제해줘야 작동
		//이유: nextLine은 enter까지 포함하나 nextInt는 포함하지 않아서 처리가 끝난걸로 되어 
		//나머지 입력도 못함
		
		/*int age = sn.nextInt();
		sn.nextLine();
		String name = sn.nextLine();
		String address = sn.nextLine();*/
		//그래서 sn.nextLine();을 추가해 enter을 없애주기
		
		System.out.println("이름 : "+ name);
		System.out.println("주소 : "+ address);
		System.out.println("나이 : "+ (age+1));
		
		
		

	}

}
