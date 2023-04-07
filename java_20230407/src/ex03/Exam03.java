package ex03;
import java.util.*;

public class Exam03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력>");
		int number = sc.nextInt();
		
		
		if(number%2==0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
		
	}

}
