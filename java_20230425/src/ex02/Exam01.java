package ex02;
//재귀함수

public class Exam01 {
	public static void main(String[] args) {
		System.out.println(factorial(5));
		
	}
		static int factorial(int n) {
			int result = 0;
			if(n==0)
				return 1;
			else
				result =n*factorial(n-1);
			return result;
		}

}