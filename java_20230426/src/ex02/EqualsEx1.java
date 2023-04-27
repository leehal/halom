package ex02;

class Value{
	int value;
	public Value(int value) {
		this.value=value;
	}
	public boolean equals(Object obj) {
		return this.value ==((Value)obj).value ? true : false;
		
	}
}

public class EqualsEx1 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		System.out.println(v1==v2);
		System.out.println(v1.equals(v2));
		System.out.println(v1.value);

	}

}
