package ex06;

import java.util.*;
public class Exam04 {
	
	
	public static void main(String[] args) {
		
		int [] num = new int[10];
		int max;
		int min;
		
		
		for(int i=0; i<num.length; i++) {
			
		num[i]= (int)(Math.random()*100)+1;
		 
		System.out.print(num[i]+", ");
		}
		
		max = min = num[0];
		for(int i=0; i<num.length; i++) {
			if(num[i]>max)
				max=num[i];}
		
		for(int i=0; i<num.length; i++) {
			if(num[i]<min)
				min=num[i];}
	
		System.out.println();
		System.out.println("최대값 : "+max+" 최소값 : "+min);
		
		
	
}

}
