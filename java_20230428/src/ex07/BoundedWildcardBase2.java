package ex07;

class Box<T>{
	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
	
}
class Toy {
	public String toString() {
		return "Toy()";
	}
}
class BoxHandler{
	public static void outBox(Box<? extends Toy> box) {
		Toy toy = box.getOb();//꺼내기
		box.setOb(toy);
		System.out.println(toy);
	}
	public static void inBox(Box<? super Toy> box,Toy n) {
		box.setOb(n);//넣기
		box.getOb(n);
	}
}


public class BoundedWildcardBase2 {

	public static void main(String[] args) {
		
		Box<Toy> box = new Box<>();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);

		
	}


}