package ex01;

class Box<T>{
	private T ob;//타입에 따라 다시 class를 만드는 게 아닌 걍 다 적용 O

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
	
}
class Unboxer{
	public static<T> T openBox(Box<T> box) {
		return box.getOb();
	}
}

public class GenericMethodBow {

	public static void main(String[] args) {
		Box <Integer> box = new Box<>();
		box.setOb(123);
		Unboxer.openBox(box);
		
		System.out.println(box.getOb());
		
		
	}

}
