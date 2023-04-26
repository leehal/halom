package ex01;

public class InExam {

	public static void main(String[] args) {
		IN01 in =(int x, int y )-> System.out.println("x+y : "+(x+y));
			in.add(3, 4);
		
		in =(int x, int y )-> System.out.println("x-y : "+(x-y));
			in.add(8, 5);
			
		in =(int x, int y )-> System.out.println("x*y : "+(x*y));
			in.add(5, 5);
		
		in =( x,  y )-> System.out.println("x/y : "+(x/y));
			in.add(6, 3);
}

	}


