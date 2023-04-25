package ex05;

//중첩 인터페이스 :클래스 안에 인터페이스 존재/ 해당 클래스와 밀접한 관계를 맺는 구현 객체를 만들기 위해
public class Button {
	
	public static interface ClickListener{
	void onClick();
}
	private ClickListener clickListener;

public void setClickListener(ClickListener clickListener) {
	this.clickListener = clickListener;
}
public void click() {
	this.clickListener.onClick();
}
}