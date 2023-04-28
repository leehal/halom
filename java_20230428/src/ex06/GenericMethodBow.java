package ex06;

class A{}
class B extends A{} 
class C extends B{} 

class Box<T>{
	private T  ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
}
class Unboxer{
//	public static void peeBox(Box<? extends B> box) { //상한 제한 Number부터 그 밑은 다 가능
	public static void peeBox(Box<? super B> box) { //하한 제한 Integer 위 부터 가능
		System.out.println(box.getOb());
	}
}

public class GenericMethodBow {

	public static void main(String[] args) {
		Box<A> abox = new Box<>();
		Box<B> bbox = new Box<>();
		Box<C> cbox = new Box<>();
		
		Unboxer.peeBox(abox);
		Unboxer.peeBox(bbox);
		Unboxer.peeBox(cbox);
		
	}	
}
