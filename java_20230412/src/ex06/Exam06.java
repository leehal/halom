package ex06;

import java.util.*;
public class Exam06 {
	
	
	public static void main(String[] args) {

		int [] lotto = new int [45];
		//여기부터
		for(int i=0; i<lotto.length; i++)
			lotto[i] = i+1;
		
		for(int i=0; i<lotto.length; i++) {
			int num = (int)(Math.random()*45);
			int tmp = lotto[i];
			lotto [i] = lotto[num];
			lotto[num] = tmp;
		}//여기까지 식의 이유: 중복을 막고 숫자를 섞어주기 위해!!
		
		System.out.println("이번주 로또 번호는 : ");
		for(int i =0; i<6; i++)
			System.out.print(lotto[i]+", ");
	
	
	
	
		}
}
