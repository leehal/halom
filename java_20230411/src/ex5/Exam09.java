package ex5;
//규율은 날 자유롭게 만든다
//날 죽이지 못한 고통은 날 강하게 한다.
//아스키코드표 참고
import java.util.*;
public class Exam09 {
	
	public static void main(String[] args) {
		
		System.out.println("1.입금 2.출금 3.잔고 4.종료");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("번호 입력");
		int num = sc.nextInt();
		
		
	
	for(int i=2; i<=9;i++) {
			for(int j=1; j<=9; j++) {
				if(i==j) continue;
				System.out.println(i+" X " +j+ " = "+ i*j);
		}
			
		}	
		
		}
		
		} 



	

