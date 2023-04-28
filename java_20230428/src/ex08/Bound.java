package ex08;

class Box<T>{
	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
}

public class Bound {
	
	public static void addBox(Box<? super Integer>b1, Box<? extends Integer>b2, Box<? extends Integer>b3) {
		b1.setOb(b2.getOb()+b3.getOb());
	}
	public static void main(String[] args) {
		
		Box<Integer> box1 = new Box<>();
		box1.setOb(24);
		Box<Integer> box2 = new Box<>();
		box2.setOb(37);
		Box<Integer> result = new Box<>();
		result.setOb(0);
		
		addBox(result, box1, box2);
		System.out.println(result.getOb());

	}

}
