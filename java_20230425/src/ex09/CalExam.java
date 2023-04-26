package ex09;

public class CalExam {

	public static void main(String[] args) {
//		-> 람다식: 인터페이스가 있어야 하며, 추상 메소드가 1개만 있을 때 사용
//		Calculable cal = (x)->{ System.out.println("x*3 : "+x*3);};
		Calculable cal = x -> x*3;//x가 하나 뿐이라 return생략 가능
		
		cal.calculable(5);
		
		cal.calculable(8);
		}
}
