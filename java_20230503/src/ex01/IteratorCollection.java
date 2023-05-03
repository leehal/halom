package ex01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorCollection {

	public static void main(String[] args) {
//		List<String> list = new LinkedList<>();
		List<String> list = new ArrayList<>();
		
		list.add("toy");
		list.add("box");
		list.add("robot");
		list.add("box");
		
//		for( String str : list)
//			System.out.println(str);
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String st = it.next();
			System.out.println(st);
		}
		it = list.iterator();//또 반복하기--> 반복자 다시 불러줘야함
		while(it.hasNext()) {//이번에는 box만 삭제하기
			String st = it.next();
			if(st.equals("box"))
				it.remove();//삭제
			System.out.println(st);
		}
	}

}
