package ex07;

public class Home {//class를 따로 생성하지 않고 만든 익명구현객체
	private RemoteControll rc =new RemoteControll() {
		
		@Override
		public void turnOn() {
			System.out.println("turnOn()");
			
		}
		
		@Override
		public void turnOff() {
			System.out.println("turnOff()");
			
		}
	};
	
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	
	public void use2(RemoteControll rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
