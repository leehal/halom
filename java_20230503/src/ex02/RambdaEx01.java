package ex02;

interface MyFunction{
	int max (int a, int b);//추상메소드
}
class MyMax implements MyFunction{//인터페이스 구현
	@Override
	public int max(int a, int b) {
		return a>b? a:b; //a와 b중 큰 값을 return
	}
}
public class RambdaEx01 {

	public static void main(String[] args) {
		MyFunction m = new MyMax();
		int num = m.max(10, 20);
		System.out.println(num);

	}

}
