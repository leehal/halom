package ex06;

import java.util.*;
public class Exam05 {
	
	
	public static void main(String[] args) {
		
		int [] num = new int[10];
		
		for(int i=0; i<num.length; i++) {
			
		num[i]= (int)(Math.random()*100)+1;
		 
		System.out.print(num[i]+", ");
		}
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num.length; j++) {//내림차순
		    //for(int j=i+1; j<num.length; j++) { //오름차순
			if(num[i]>num[j]) {
			int a=num[i];
			num[i]=num[j];
			num[j]= a;
			}
			}
		}

		System.out.println();
		for(int i=0; i<num.length;i++)
		    System.out.print(num[i]+", ");
	
}
}