package ex01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyfristStream {

	public static void main(String[] args) {
		int[] ar = {1,2,2,3,4,5,5,6};
		
		//배열의 짝수합을 구함.. 단 중복 제거
//		int sum =0;
//		for(int a : ar) {
//			if(a%2==0)
//				sum+=a;
//		}System.out.println(sum); //중복제거 X
		
		IntStream stm1 = Arrays.stream(ar);//배열 ar로부터 스트림 생성
		int total= stm1.distinct().filter(n-> n%2==0).sum();//중복제거.
		System.out.println(total);
		
		//배열에서 중복제거 후 홀수 갯수는?
		stm1 = Arrays.stream(ar);
		int count = (int)stm1.distinct().filter(n-> n%2==1).count();
		System.out.println(count);
		
		String[] names = {"kim","park","hong","lee","kor","eng","math"};
		
		//1. 이름출력
		Stream<String> stm2 = Arrays.stream(names);
		stm2.forEach(str-> System.out.println(str));
		System.out.println("-------------");
		
		//2. 첫글자가 k인 것만 출력
		stm2 = Arrays.stream(names);
		stm2.filter(name->name.startsWith("k"))
			.forEach(str-> System.out.println(str));
		System.out.println("-------------");
		
		//글자수가 4자 이상만 출력
		stm2 = Arrays.stream(names);
		stm2.filter(name->name.length()>=4)
			.forEach(str->System.out.println(str));
		System.out.println("-------------");
		
		
		List<String> list = Arrays.asList("toy","box","robot");
		
		//1. 리스트를 스트림으로 변환 후 출력
		Stream<String> s = list.stream();
		s.forEach(n->System.out.println(n));
//		s.sorted().forEach(n->System.out.println(n));
		
		//2. 리스트를 스트림으로 변환후 글자 갯수합을 출력
		s = list.stream();
		long count2 = s.map(n->n.length()).count();
		System.out.println(count2);//글자수
		
		s = list.stream();
		int sum = s.mapToInt(n->n.length()).sum();
		System.out.println(sum);//글자수 합
		
		
		
		boolean t = test(11);
//		System.out.println(t);
	}
	static boolean test(int n) {
		return n%2==0;
	}
}
