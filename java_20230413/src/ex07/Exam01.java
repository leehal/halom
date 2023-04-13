package ex07;

import java.util.Arrays;

public class Exam01 {

	public static void main(String[] args) {
		
		int [] arrnum = {10,20,30,40,50};
		System.out.println(Arrays.toString(arrnum));
		
		int[] arrnum2 = new int [10];
		
		for(int i=0;i<arrnum2.length; i++)
			arrnum2[i]=arrnum[i];
		
		System.out.println(Arrays.toString(arrnum2));
		

	}

}
