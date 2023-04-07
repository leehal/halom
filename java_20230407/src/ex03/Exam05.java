package ex03;
//규율이 날 자유롭게 만든다.
//규율이 날 자유롭게 만든다.
import java.util.*;

public class Exam05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("계절입력>");
		String str = sc.nextLine();
		
		switch(str){
		case "spring" : 
			System.out.println("봄");
			break;
		case "summer" :
			System.out.println("여름");
			break;
		case "fall" :
			System.out.println("가을");
			break;
		case "winter" :
			System.out.println("겨울");
			break;
		default :
			System.out.println("아직도..");
		
		
	}
System.out.println("프로그램 종료");
}
}
