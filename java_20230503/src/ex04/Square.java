package ex04;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

//람다식
 interface Aaa{
	int max(int a,int b);
}
interface Sq{
	int square(int x);
}
interface Bbb{
	void printVar(String name,int i);
}
interface Ccc{
	void func();
}
interface Ddd{
	int roll();
}
interface Eee{
	int sumArr(int []arr);
}
public class Square {

	public static void main(String[] args) {
		Aaa aa = (a,b)-> a>b? a:b;
		System.out.println(aa.max(4, 8));
		
		BiFunction<Integer, Integer, Integer> bi = (a,b) -> a>b?a:b;
		System.out.println(bi.apply(3, 7));
		
		Sq  sq= (int x)-> x*x;
		System.out.println(sq.square(3));
		
		Bbb b = (name,i)->System.out.println(name+", "+i);
		b.printVar("kim", 20);
		
		BiConsumer<String, Integer> bi2=(name,i)->System.out.println(name+", "+i);
		bi2.accept("kim", 24);
		
		Ccc c = () -> System.out.println("----------");
		c.func();
		
		Ddd d= ()-> (int)(Math.random()*6);
		System.out.println(d.roll());
		
		Supplier<Integer>bi3=()->(int)(Math.random()*6);
		System.out.println(bi3.get());
		
		Eee e =(arr)->{
			int sum=0;
			for(int i :arr)
				sum+=i;
			return sum;
		};
		int []arr = {8,10,55,5}; 
		System.out.println(	e.sumArr(arr));
		
		Function<int[], Integer> fu=(arr2)->{
			int sum=0;
			for(int i :arr2)
				sum+=i;
			return sum;
		};
		
		int num2 = fu.apply(arr);
		System.out.println(num2);
		
		
	}

}
