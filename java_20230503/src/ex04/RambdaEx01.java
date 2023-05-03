package ex04;
//람다식
interface MyFunction{
	int max (int a, int b);
}
public class RambdaEx01 {

	public static void main(String[] args) {
		MyFunction m =//구현객체만 올 수 있는데 여기선 max를 구현한것만,
				//바디만 구현
			(int a, int b)->  a>b? a:b;		
			//한 줄인 경우 return과 중괄호 삭제 할 수 O
		System.out.println("max: "+m.max(10, 20));

	}

}
