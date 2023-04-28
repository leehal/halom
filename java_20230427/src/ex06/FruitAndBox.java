package ex06;

class Fruit {public String toString( ) {return "Fruit";}}
class Apple extends Fruit{public String toString( ) {return "Apple";}}
class Grape extends Fruit{public String toString( ) {return "Grape";}}
class Toy {public String toString( ) {return "Toy";}}

public class FruitAndBox {
	public static void main(String[] args) {
		
	Box<Fruit> fruitBox
	
	aBox.setObj(new Apple());//제한 후 오류 나옴!
	oBox.setObj(new Orange());
	
	Apple ap = aBox.getObj();
	Orange or = oBox.getObj();
	System.out.println(ap);
	System.out.println(or);
	
	}
}
	


