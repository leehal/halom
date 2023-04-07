package ex03;
//규율이 날 자유롭게 만든다.
//규율이 날 자유롭게 만든다.
import java.util.*;

public class Exam06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학년입력>");
		int str = sc.nextInt();
		
		switch(str) {
		case 1: 
			System.out.println("1학년");
			break;//break 없으면 1을 작성했을 때 1학년~4학년, 1~4외의 다른 숫자 입력불가까지 다 출력됨
		case 2: 
			System.out.println("2학년");
			break;
		case 3: 
			System.out.println("3학년");
			break;
		case 4: 
			System.out.println("4학년");
			break;
		default :
			System.out.println("1~4 외의 다른 숫자 입력불가");
		
		}
		
System.out.println("프로그램 종료");

}
}
