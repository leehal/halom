package ex01;

public class Exam03 {

	public static void main(String[] args) {
		
		String[] arr = {"100","kor","300"};
		
		for(int i=0;i<arr.length+1;i++) {
		try {
		
			int value = Integer.parseInt(arr[i]);
			System.out.println(value);
		
		}catch(java.lang.NumberFormatException e) {
			e.printStackTrace();//kor같은 건 숫자로 변환 X 에러
			System.out.println("숫자가 아닌 문자는 숫자로 변환불가");
		}catch(java.lang.ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();//범위 벗어남 에러
			System.out.println("배열 크기를 벗어남");
		}catch(Exception e) {
//	catch(Exception e)이 처음에 오면 오류! 		
			System.out.println("모든 예외처리 완");
		}finally {
			System.out.println("예외발생 하든말든 무조건 처리해야하는 문장은 여기에");
		}
		}
		System.out.println("프로그램 종료");
	}

}
