package ex06;

import java.util.*;
public class Exam08 {
	
	
	public static void main(String[] args) {
		
	
		int sum =0;
		
		int [] num = new int [10];
		
		for(int i =0; i<num.length; i++ ) {
			num[i]=(int)(Math.random()*100)+1;
		    System.out.print(num[i]+ ", ");
		    sum+=num[i];
		}
		
		double avg = sum/(	double )num.length;
		 System.out.println();
		 System.out.println("합"+sum);
		 System.out.println("평균"+avg);
		 
		for(int i=0; i<num.length;i++) {
		    for(int j=i; j<num.length; j++)	{
		    	if(num[i]<num[j]) {
		    		int m=num[i];
		    		num[i]=num[j];
		    		num[j]=m;}
		    }
		    
		    System.out.print( num[i]+ ", ");
		}
		    System.out.println();
	System.out.println("최대값 : "+num[0]);
	System.out.println("최소값 : "+num[9]);
	
	int max=0, min=num[0];


	 for(int i=0;i<num.length;i++ ) 
		 if(max<num[i]) 
			 max=num[i]; 
	 
	 System.out.println("최대값 : "+max);
	 
	 for(int i=0;i<num.length;i++ ) 
		 if(min>num[i]) 
			 min=num[i]; 
	 
	 System.out.println("최소값 : "+min);

	
		
		}
}
