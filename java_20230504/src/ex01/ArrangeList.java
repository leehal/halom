package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ArrangeList {

	public static void main(String[] args) {
		List<Integer> is = Arrays.asList(1,3,5,7,9);
		
		is = new ArrayList<>(is);
		is.add(11);
		
		System.out.println(is);
		
//		Consumer<List<Integer>> c =t -> Collections.reverse(t);
		Consumer<List<Integer>> c = Collections::reverse;
		c.accept(is);
		
		System.out.println(is);

	}

}
