package ex02;
class Robot{}

class DanceRobot extends Robot{
	
	void dance() {System.out.println("춤추자");};
	
}
class SingRobot extends Robot{
	void Sing() {System.out.println("노래하자");};
}
class DrowRobot extends Robot{
	void Drow() {System.out.println("그림그리자");};
}
public class Exam03 {
	static void action (Robot r) {
		if(r instanceof DanceRobot){
//r이 참조하고 있는 대상이 DanceRdobot이면 true, 아님 false
			DanceRobot d= (DanceRobot)r;
			d.dance();}
		else if(r instanceof DrowRobot) {
			DrowRobot dr=(DrowRobot)r;
			dr.Drow();}
		else if(r instanceof SingRobot) {
			SingRobot s=(SingRobot)r;
			s.Sing();}
	}

	public static void main(String[] args) {
		
		Robot[] arr 
		= {new DanceRobot() , new SingRobot(), new DrowRobot()};
		for(int i =0; i< arr.length;i++)
			action(arr[i]);
		
		

	}

}
