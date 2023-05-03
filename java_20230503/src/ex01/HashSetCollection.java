package ex01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Num{
	private int num;
	public Num(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		
		return  String.valueOf(num);
	}
	@Override
	public int hashCode() {
		
		return num%3;
	}
	@Override
	public boolean equals(Object obj) {
		
		return num== ((Num)obj).num ? true: false;
	}
}

public class HashSetCollection {

	public static void main(String[] args) {
		Set<Num> set = new HashSet<>();//set 중복허용X
		
		set.add(new Num(3));
		set.add(new Num(14));
		set.add(new Num(5));
		set.add(new Num(8));
		set.add(new Num(3));
		set.add(new Num(30));
		
		for(Num s: set)
			System.out.println(s);
		
		System.out.println("------------------------");
		
		Set<Integer> set2 = new HashSet<>();
		for(int i=0;set2.size()<6;i++) {
			int num = (int)(Math.random()*45)+1;
			set2.add(num);
		}
		for(int s : set2)
			System.out.println(s+", ");
	}

}
