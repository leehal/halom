package ex03;
class A{}
class B extends A{}
class C extends A{}
class Box<T extends A>{
	private T  ob;//타입에 따라 다시 class를 만드는 게 아닌 걍 다 적용 O

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
	
}
class Unboxer{
	public static<T extends A> T openBox(Box<T> box) {
		return box.getOb();
	}
}

public class GenericMethodBow {

	public static void main(String[] args) {
		Box<C> cbox = new Box<C>();
		Box<A> abox = new Box<A>();
		Box<B> bbox = new Box<B>();
		
		
		
	}

}
