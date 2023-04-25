package ex07;

public class MainExam {

	public static void main(String[] args) {
		Home home =new Home();
		home.use1();
		
//		home.use2(이자리는 RemoteControll 구현 객체가 와야함);
		home.use2(new RemoteControll() {
			
			@Override
			public void turnOn() {
				System.out.println("turnOn");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("turnOff");
				
			}
		}
		);

	}

}
