package ex04;

class Box<T>{
	private T  ob;//타입에 따라 다시 class를 만드는 게 아닌 걍 다 적용 O

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
}

public class GenericMethodBow {

	public static void main(String[] args) {
		Box<Integer> box1 = new Box<Integer>();
		box1.setOb(99);
		Box<Integer> box2 = new Box<Integer>();
		box2.setOb(55);
		
		System.out.println(box1.getOb()+"&"+ box2.getOb());
		swapBox(box1,box2);
		System.out.println(box1.getOb()+"&"+ box2.getOb());
		
	}
	static <T> void  swapBox(Box<T> box,Box<T> box2) {
		Box<T> tmp =new Box<T>();
		tmp.setOb(box.getOb());
		box.setOb(box2.getOb());
		box2.setOb(tmp.getOb());
		
	}	
}
