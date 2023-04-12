package ex5;
//규율은 날 자유롭게 만든다
//날 죽이지 못한 고통은 날 강하게 한다.
//아스키코드표 참고
import java.util.*;
public class Exam11 {
	
	public static void main(String[] args) {
		
		System.out.println("몇 번 입력?");
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		int sum=0;
		int num=0;
		for(;count-1>=0;count--) {
			System.out.println("숫자 입력");
			 num = sc.nextInt();
				if (count-1>0) {
					if(num%2==1)
						continue;
					else
						sum+=num;
				}
				else 
					sc.next();
				System.out.println("정수만 입력");
					continue;
					
		
		}
		System.out.println("짝수 값의 합은"+ sum);
		
		}
			
		}	
		
		
		
		




	

