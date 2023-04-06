package java_20230406;



import java.util.Scanner; 

public class Exam04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("면접점수 입력 : ");
		int 면접점수 = sc.nextInt();
		System.out.println("실기점수 입력 : ");
		int 실기점수 = sc.nextInt();
		
		if(면접점수 >= 70) {
			if(실기점수 >= 70)
			    System.out.println("합격");	
			else {
				System.out.println("불합격");
				}
		
		} else {
		System.out.println("불합격");	
		
		}
		
		

	}

}
