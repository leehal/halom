package ex03;
//규율은 날 자유롭게 만든다..............................
import java.util.*;
public class Exam08 {

	public static void main(String[] args) {
		
		int com =(int) Math.random()*3+1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1/가위 2/바위 3/보 중 하나 입력");
		int user = sc.nextInt();

		
		
		
		switch(user-com) {
		case 0 :
			System.out.println("비김");
			break;
		case -2:
		case 1 :
			System.out.println("user 승");
			break;
		case -1 :
		case 2 :
			System.out.println("com 승");
			break;
		
		
		
		}

		System.out.println("user"+ user + ", com: "+ com);

}
}