package ex08;

public class CalExam {

	public static void main(String[] args) {
//		Calculable cal = new Add();
//		cal.calculable(10, 5);
//		
//		cal = new Sub();
//		cal.calculable(5, 2);
		
		Calculable cal = new Calculable() {
			
			@Override
			public void calculable(int x, int y) {
				System.out.println("x-y : "+(x-y));
				
			}
		};
		cal.calculable(5, 2);
		
//		-> 람다식: 인터페이스가 있어야 하며, 추상 메소드가 1개만 있을 때 사용
		cal = (int x, int y)-> {
				System.out.println("x-y : "+(x-y));  };//몸부분 재정의
		cal.calculable(15, 2);
	
		cal = (x, y)-> System.out.println("x-y : "+(x-y));;
		cal.calculable(12, 2);
}
}
