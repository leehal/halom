package ex01;

public class Exam02 {

	public static void main(String[] args) {
		
		
		double d = 85.4;
		int score = 10;
		
		d = score;
	//	d = (double)score;
		
	//	score = d; 이러면 오류!
		score = (int)d; //큰 쪽으로 바뀌면 괜찮지만 작아지는건 지정해야함. d의 경우 깂이 바뀔 수 있음
		System.out.println(score);
		
		System.out.println(d);
		d = 85.4;
		
		score = (int)d;
		System.out.println(score); 
		
		int sum = 10;
		long longsum = 300000000l; //보통 모두 int라서 int보다 큰 long은 저장 전에 이거 long이라고 알려줘야 해서 l 붙임
		
		longsum = (long)sum;
		system.out.println(longsum);
		
		System.out.println((double)5/2); //실수형이 되어서 2.5로 나옴, 원래는 2로 나옴 나머지 버림.
		
		System.out.println(5&2); //그리고
		System.out.println(5|2); //또는
		
		
		

	}

}
