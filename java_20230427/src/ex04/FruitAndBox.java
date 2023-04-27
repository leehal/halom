package ex04;
//박스에 과일 넣다빼기.
class Apple{
	public String toString() {
			return "Apple";
	}
}
class Orange{
	public String toString() {
		return "Orange";
	}
}
class Box{
	private Object obj;
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
}

public class FruitAndBox {
	public static void main(String[] args) {
		
	
	Box aBox = new Box();
	Box oBox =new Box();
	
	aBox.setObj("Apple");
	oBox.setObj("Orange");
	
	Apple ap = (Apple)aBox.getObj();
	Orange or = (Orange)oBox.getObj();
	System.out.println(ap);
	System.out.println(or);
	
	}
}
	


