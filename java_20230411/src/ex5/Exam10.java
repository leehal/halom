package ex5;
//규율은 날 자유롭게 만든다
//날 죽이지 못한 고통은 날 강하게 한다.
//아스키코드표 참고
import java.util.*;
public class Exam10 {
	
	public static void main(String[] args) {
		
		int com = (int)(Math.random()*100)+1;
		int	count=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int num = sc.nextInt();
			count++;
			System.out.println(count+"번째");
			if(num<com)
				System.out.println("크다");
			else if(num>com)
				System.out.println("작다");
			else if(num==com)
				break;}
		
			System.out.println("정답");
		
		
		
		
		
		}
			
		}	
		
		
		
		




	

