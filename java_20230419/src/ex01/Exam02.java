package ex01;
import java.util.*;
class A{
	String 이름;
	int 계좌;
	A(){
		this.이름 = 이름;
		this.계좌 =계좌;
	}
	
}
class B extends A{
	int 입금액;
	
	B(String 이름,int 계좌,int 입금액){
		super();
		this.입금액 = 입금액;
	}
	void 계좌생성() {
		System.out.println(이름+","+계좌+","+입금액);
	}
}

public class Exam02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				String 이름= sc.nextLine();
				int 계좌 = sc.nextInt();
				int 입금액 = sc.nextInt();
				
				B b =new B(이름,계좌,입금액);
				b.계좌생성();
		
	
	}

}
