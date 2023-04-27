package ex02;
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
class AppleBox{
	private Apple ap;
	public Apple getAp() {
		return ap;
	}
	public void setAp(Apple ap) {
		this.ap = ap;
	}
}
class OrangeBox{
	private Orange or;
	public Orange getOr() {
		return or;
	}
	public void setOr(Orange or) {
		this.or = or;
	}
}
public class FruitAndBox {
	public static void main(String[] args) {
		
	
	AppleBox aBox = new AppleBox();
	OrangeBox oBox =new OrangeBox();
	
	aBox.setAp(new Apple());
	oBox.setOr(new Orange());
	
	Apple a =aBox.getAp();
	Orange o=oBox.getOr();
	System.out.println(a);
	System.out.println(o);
	
	}
}
	


