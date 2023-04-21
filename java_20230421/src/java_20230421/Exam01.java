package java_20230421;
class Robot{}
class Dance extends Robot{
	void dance() {
		System.out.println("춤");
	}
}
class Sing extends Robot{
	void sing() {
		System.out.println("노래");
	}
}
class Draw extends Robot{
	void draw() {
		System.out.println("그림");
	}
}
public class Exam01 {
	static void action(Robot r) {
		if(r instanceof Dance) {
			Dance d = (Dance)r;
			d.dance();
		}else if(r instanceof Sing) {
			Sing s = (Sing)r;
			s.sing();
		}else if(r instanceof Draw) {
			Draw dr = (Draw)r;
			dr.draw();
		}
	}
	
	public static void main(String[] args) {
		Robot [] arr =  {new Dance(),new Sing(),new Draw()};
		
		for(int i=0; i<arr.length;i++)
			action(arr[i]);

	}

}
