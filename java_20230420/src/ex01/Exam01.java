package ex01;
import java.util.*;

class Account{
	String 계좌;
	String 계좌주;
	int 예금액;
	int count;
	public Account (String 계좌,String 계좌주,int 예금액) {
		this.계좌=계좌;
		this.계좌주=계좌주;
		this.예금액=예금액;
	}
	void 계좌목록(int i) {
		System.out.println(Account.acc[i]+", ");
	}
	void 출금(int bal) {
		this.예금액 -= bal;
	}
	void 입금(int bal) {
		this.예금액 += bal;
	}
}

public class Exam01 {

	public static void main(String[] args) {
		boolean flag =true;
		int count =0;
		Account []acc = new Account[100]; 
		
		Scanner sc= new Scanner(System.in);
		while(flag)
		System.out.println("1. 계좌생성| 2.계좌목록| 3.출금| 4.예금| 5.종료");
		int num =Integer.parseInt(sc.nextLine());
		System.out.println("선택>> "+num);
		switch(num) {
		case 1:
			System.out.println("계좌생성");
			System.out.println("계좌번호 입력");
			String 계좌 =sc.nextLine();
			System.out.println("계좌주 입력");
			String 계좌주 =sc.nextLine();
			System.out.println("초기입금액 입력");
			int 예금액 =Integer.parseInt(sc.nextLine());
			acc[count].계좌목록(count);
					count++;
			break;
		case 2:
			System.out.println("계좌목록");
			for(int i=0;i<count;i++)
				acc[i].계좌목록(i);
			break;
		case 3:
			System.out.println("출금");
			System.out.println("계좌번호 입력");
			String 계좌2 =sc.nextLine();
			for(int i=0;i<count;)
			if(계좌2.equals(acc[i].계좌){
			     int bal =Integer.parseInt(sc.nextLine());
					acc[i].출금(bal);
			}break;
		case 4:
			System.out.println("예금");
			System.out.println("계좌번호 입력");
			String 계좌3 =sc.nextLine();
			for(int i=0;i<count;)
				if(계좌3.equals(acc[i].계좌){
						int bal =Integer.parseInt(sc.nextLine());
						acc[i].입금(bal);
				}
			break;
		case 5:
			System.out.println("종료");
			flag= false;

		}
		

	}

}
