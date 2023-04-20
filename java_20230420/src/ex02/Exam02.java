package ex02;
class Unit{
int x,y;
	void move(int x,int y) {System.out.println();};
	void stop() {}
}

class Marine extends Unit{
	void move(int x,int y) {System.out.println("걸어서 이동");};
	void StimPack() {}
}
class Tank extends Unit{
	void move(int x,int y) {System.out.println("탱크로 이동");};
	void changeMode() {}
}
class Dropship extends Unit{
	void move(int x,int y) {System.out.println("배로 이동");};
	void lead() {}
	void unlead(){}
}
public class Exam02 {

	public static void main(String[] args) {
		
		Dropship dr = new Dropship();
		dr.move(10, 10);
		
		

	}

}
