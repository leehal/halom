package ex03;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		
		Optional<String> os1 =Optional.of( new String("toy1"));
		Optional<String> os2 =Optional.of( new String("toy2"));
		
		if(os1.isPresent()) {
			System.out.println();//참조하는 대상이 있으면 os1을 찍어줌
			System.out.println(os1.get());//참조하는 대상이 있으면 값을 찍어줌
		}
		else
			System.out.println(os1.orElse("no"));	
		

	}

}
