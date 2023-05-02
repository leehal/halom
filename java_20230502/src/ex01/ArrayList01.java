package ex01;

import java.util.ArrayList;
import java.util.Collection;

class Member{
	String name;
	int age;
	public Member(String name, int age) {
		this.name =name;
		this.age = age;
	}
}

public class ArrayList01 {

	public static void main(String[] args) {
		ArrayList<Object> list1 = new ArrayList<Object>();
		
		list1.add(10);
		list1.add("kor");
		list1.add(new Member("로이", 13));
		
		System.out.println("size :"+ list1.size());
		
		Collection<E>
		for(int i=0; i<list1.size();i++)
			System.out.println(list1.get(i));

	}

}
