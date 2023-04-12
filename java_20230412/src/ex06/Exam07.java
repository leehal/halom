package ex06;

import java.util.*;
public class Exam07 {
	
	
	public static void main(String[] args) {
		final int a =10;
		int [] num = new int [a];
		int i,j ;
		
		for(i=0; i<num.length;i++)
			num[i] = (int)(Math.random()*100)+1;
		
//     System.out.print(num[i]+ ", ");
		
		
		for( i=0; i<num.length; i++) {
			for( j=i+1 ; j<num.length; j++ ) 
				if(num[i]<num[j]) {
					 int s = num[i];
			         num[i]=num[j];
					 num[j]= s;}
					
			System.out.print(num[i]+ ", ");
		
		}					
		
	
	
		
	
		}
}
