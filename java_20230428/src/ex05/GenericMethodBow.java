package ex05;

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
//	public static void peeBox(Box<? extends Number> box) { //상한 제한 Number부터 그 밑은 다 가능
	public static void peeBox(Box<? super Integer> box) { //하한 제한 Integer 위 부터 가능
		System.out.println(box.getOb());
	}
}

public class GenericMethodBow {

	public static void main(String[] args) {
		Box<Integer> ibox = new Box<Integer>();
		ibox.setOb(123);
		
		Box<Double> dbox = new Box<Double>();
		dbox.setOb(123.124);
		
		Box<String> sbox = new Box<String>();
		sbox.setOb("kor");
		
		Unboxer.peeBox(ibox);
		Unboxer.peeBox(dbox);
		Unboxer.peeBox(sbox);
		
	}	
}
