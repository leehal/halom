package ex9;
import java.util.*;

class Member{
	String name;
	String id;
	String password;
	int age;
	
	boolean login(String id, String password) {
		if(id.equals("홍길동")&& password.equals("12345"))
			
			return true;
		else return false;
	}
	void logout(String id) {
		System.out.println(id+"님 로그아웃되었습니다.");
	}
}
	
public class Exam02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("아이디 입력");
		//String id = sc.nextLine();
		//System.out.println("비번 입력");
		
		Member gildong= new Member();
		
		boolean a=gildong.login("홍길동", "12345");
		
		if(a==true)
			System.out.println("로그인 성공");
		else
			System.out.println("로그인 실패");
		
		gildong.logout("홍길동");
		
		
	}

}


