package ex01;

public class Exam04 {

	public static void main(String[] args) throws ClassNotFoundException {
//		예외 던지기
		try {
		findClass();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}

	private static void findClass() throws ClassNotFoundException {
		
			Class.forName("java.lang.String2");
		
		
	}

}
