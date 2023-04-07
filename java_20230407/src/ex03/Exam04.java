package ex03;
//규율이 날 자유롭게 만든다.
//규율이 날 자유롭게 만든다.
import java.util.*;

public class Exam04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력>");
		int num = sc.nextInt();
		
		
		if(num%2 ==0 && num%3==0)
			System.out.println("2와3의 배수");
		else
			System.out.println("2와3의 배수가x");
		
	}

}
