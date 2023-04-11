package ex5;
//규율은 날 자유롭게 만든다
//날 죽이지 못한 고통은 날 강하게 한다.
//아스키코드표 참고

public class Exam07 {
	
	public static void main(String[] args) {
	
		int num = 12345;
		int sum =0;
		
		/*
		sum += num % 10;---->5
		num = num/10;----->1234
		sum += num % 10;---->4
		num = num/10;----->123
		sum += num % 10;---->3
		num = num/10;----->12
		sum += num % 10;---->2
		num = num/10;------>1
		sum += num % 10;---->0
		*/
		
		while(num>0) {
			sum += num % 10; //sum = sum+ num % 10
			num = num/10;
		}
			
			
		
		System.out.println("sum" + sum);
		}
		
		} 

	

