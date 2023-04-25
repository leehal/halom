package ex06;

public class Car {
		private Tire tire = new Tire();
		
		private Tire tire2 = new Tire(){
			public void roll() {
				System.out.println("익명 자식 Tire 객체 1이 굴러감");
			}
			public void test() {
				System.out.println("익명 자식 test");
			}
		};

		public void run1() {
			tire.roll();
			tire2.roll();
		}
		public void run2() {
			Tire tire =new Tire() {
				
				public void roll() {
					System.out.println("익명 객체 2가 굴러감");
			}
		};
		tire.roll();
}
		public void run3(Tire tire) {tire.roll();}
}