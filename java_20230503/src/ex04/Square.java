package ex04;
interface Sq{
	int square(int x);
}
interface Bbb{
	void printVar(String name,int i);
}
interface Ccc{
	void func();
}
public class Square {

	public static void main(String[] args) {
		Sq  sq= (int x)-> x*x;
		System.out.println(sq.square(3));
		
		Bbb b = (name,i)->System.out.println(name+", "+i);
		b.printVar("kim", 20);
		
		Ccc c = () -> System.out.println("----------");
		c.func();

	}

}
