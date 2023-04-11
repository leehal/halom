package ex5;
//규율은 날 자유롭게 만든다
public class Exam05 {
	
	public static void main(String[] args) {
	
		int i=0;int sum =0;
		//()에 있는 조건이 참이면 반복
		while(i<10) {
		
		i++;
		sum += i;
		
		}
		System.out.println("sum = "+ sum);
		System.out.println("------------------------");
		
		//곱셈식
		int k=2;
		int m=1;
		
		while(k<=9) {
		m=1;//3단으로 넘어갈 때 m을 초기화 하지 않으면 m은 10이라 반복되지 X
		    while(m<=9) {
		    	System.out.printf("%d x %d = %d\n",k,m,k*m);
		    	m++;
		    }
		k++;
		}
		
		
		
		
		
		
		
		} 
		
		

	}

