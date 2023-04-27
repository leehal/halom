package ex06;
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
class Box <T>{//setObj 타입 제한 String 같은거 못 들어가게
	private T obj;
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
}

public class FruitAndBox {
	public static void main(String[] args) {
		
	
	Box<Apple> aBox = new Box<Apple>();//Apple 이거나 Apple을 상속한 타입만 가능함.
	Box<Orange> oBox =new Box<Orange>();//Orange 거나 Orange를 상속한 타입만 가능함.
	
	aBox.setObj(new Apple());//제한 후 오류 나옴!
	oBox.setObj(new Orange());
	
	Apple ap = aBox.getObj();
	Orange or = oBox.getObj();
	System.out.println(ap);
	System.out.println(or);
	
	}
}
	


