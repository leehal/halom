package ex04;

public class Exam03 {
//3이상 4462 이하에서 짝수인 정수의 합
	
	public static void main(String[] args) {
     
		int num =0;
		
		for(int i = 3; i <= 4462; i++ ) {
			if(i%2==0)
				num = i + num;
				
				
				
				
				
		}	
		System.out.println("3이상 4462 이하에서 짝수인 정수의 합 : "+num);
	}
0
}
