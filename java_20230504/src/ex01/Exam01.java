package ex01;

import java.util.Scanner;
import java.util.function.BiFunction;

interface Aaa{
	void PrintA(String name, int age);
}

public class Exam01 {
public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
	String str = sc.nextLine();
	int num = sc.nextInt();
	
	BiFunction<String, Integer, String> bi = (name,age)->"이름은 "+name+"이고, "+"나이는 "+age+"입니다.";
	System.out.println(bi.apply(str, num));
}
}
