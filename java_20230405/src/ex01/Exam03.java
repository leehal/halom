package ex01;

public class Exam03 {

	public static void main(String[] args) {
		
		int num = 10;
		int sum = 0;
		int tmp = 0;
		
		//num = num+1;
		//num = +1;
		
		//num += 1; //위의 것을 이렇게 줄여서 쓰는 거 가능
		
		//num++; //값을 증가하긴 하지만 +가 어디 붙든 아래 것과 같은 것이나
		//++num;
		
		tmp = ++num;
		
		sum = num++;
		
		System.out.println("tmp :" + tmp);
		System.out.println("sum :" + sum);
		System.out.println("num :" + num);
		
		
		
		

	}

}
