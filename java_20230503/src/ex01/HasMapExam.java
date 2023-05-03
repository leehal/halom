package ex01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HasMapExam {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(5, "kim");
		map.put(10, "lee");
		map.put(6, "park");
		map.put(9, "kim");
		map.put(22, "yang");
		
		System.out.println(map);
		System.out.println(map.get(22));
		
		System.out.println("------------------");
		
		Set<Integer> set=map.keySet();
		System.out.println(set);
		for(int n : set )
			System.out.println(n);

		System.out.println("------------------");
		for(int n : set )
			System.out.println(map.get(n));
	}

}
