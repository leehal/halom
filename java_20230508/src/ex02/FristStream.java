package ex02;

import java.util.Arrays;
import java.util.stream.IntStream;

class ReportCard{
	private int kor;
	private int eng;
	private int math;
	public ReportCard(int kor, int eng, int math) {
		this.kor= kor;
		this.eng = eng;
		this.math = math;
	}
	public int gerKor() {
		return kor;
	}
	public int gerEng() {
		return eng;
	}
	public int gerMath() {
		return math;
	}
}
public class FristStream {

	public static void main(String[] args) {
		ReportCard[] cards = {
			new ReportCard(70, 80, 90)	,
			new ReportCard(79, 80, 70)	,
			new ReportCard(70, 70, 70)	,
			new ReportCard(90, 90, 100)	
		};
		IntStream s1 = Arrays.stream(cards)
				.flatMapToInt(
						r->IntStream.of(r.gerKor(),r.gerEng(),r.gerMath())
						);
		double average= s1.average().getAsDouble();
		System.out.println(average);
		
		//array를 {10,20,30,40,50,60}으로 만들기
		int[][] array = {{10,20},{30,40},{50,60}};
		
		Arrays.stream(array).flatMapToInt(t->Arrays.stream(t))
							.forEach(s->System.out.println(s));
		
		
	}

}
