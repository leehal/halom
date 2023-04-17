package ex9;

class Tv{
	//멤버변수, 함수
	String color;
	boolean power;
	int channel;
	//메소드, 멤버함수
	void power() {power = !power;}
	void channelUp() { channel++;}
	void channelDown() {channel--;}
}


public class Exam01 {

	public static void main(String[] args) {
		
		Tv tv= new Tv();
		tv.color = "검정";
		tv.channelUp();
		tv.channelDown();
		
		System.out.println(tv.color);
		System.out.println(tv.channel);
		
		Tv lgtv = new Tv();
		lgtv.color = "하양";
		lgtv.channelUp();
		lgtv.channelUp();
		
		System.out.println(lgtv.color);
		System.out.println(lgtv.channel);

	}

}
