package ex01;

import java.util.function.Function;

public class Example {

	public static void main(String[] args) {
		Button btnOk= new Button();
		btnOk.setClickListener(new ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("ok");
				
			}
		});
		btnOk.click();
		
		Button btnCancle = new Button();
		btnCancle.setClickListener(()->System.out.println("cancel"));
		btnCancle.click();
	}

}
