package ex07;

import java.util.Arrays;

public class Exam02 {

	public static void main(String[] args) {
		
		//int[][] num = new int [4][4];
		
		int [][] num = new int[4][4];
		
		int k=0;
				
		for(int i=0; i<4; i++) {
			for(int j=0; j<num[i].length ; j++) {
				if(i==j) 
					num[i][j]= ++k;
						
				System.out.print(num[i][j]+", ");
		}
			System.out.println();
			
			
			
			//이렇게 짧게 줄이기 가능!!
			/* int [][] a = new int [4][4];
			 * 
			 * for(int=0; i<=a; i++){
			 * a [i][i]= i+1;
			 * 
			 * System.out.println(Arrays.toString(a[i]));
			 * }
			 */
			
			
			
			
		}
	}
	
}
