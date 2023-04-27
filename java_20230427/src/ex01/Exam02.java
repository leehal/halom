package ex01;
//p.505. 정규식
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam02 {
//str에 숫자만 있으면 true// 문자도 있으면 false
	public static void main(String[] args) {
		String str ="123456890";
		
		Pattern p =Pattern.compile("^[0-9]*$");
		Matcher m = p.matcher(str);//str이 정규 표현식과 일치하는지 판단. 
		System.out.println(m.find());
		
		String str2 = "ABC123";		//6자 입력하기 + 숫자와 대문자만 가능
		Pattern p2 = Pattern.compile("^[0-9A-Z]{6}$");
		Matcher m2 = p2.matcher(str2);
		System.out.println(m2.find());
		
		String str3 = "aaa11@1111.com";
		Pattern p3 = Pattern.compile("[\\w]*@[\\w]*.com$");
		Matcher m3 = p3.matcher(str3);
		System.out.println(m3.find());
		
	}

}

