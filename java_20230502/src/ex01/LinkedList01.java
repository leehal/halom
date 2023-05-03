package ex01;
//p.599
import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
		LinkedList<Integer> lists =new LinkedList<>();
		
		lists.add(10);
		lists.add(20);
		lists.add(30);
		
//		int num =lists.peek();
//		int num =lists.poll();
		int num =lists.remove();
		
		System.out.println(num);
		System.out.println(lists);
		

	}

}
