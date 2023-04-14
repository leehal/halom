package ex07;

import java.util.Arrays;

public class Exam5 {

	public static void main(String[] args) {
		
		
		int sum=0;
		int [][] num = new int[5][5];
		
		for(int i=0; i<num.length;i++) {
			for(int j=0; j<num.length;j++) {
				sum++;
				num [i][j]=sum;
				System.out.printf("%2d, ",num[i][j]);
			}
			
		System.out.println();	
			
		}
	}
	
}
