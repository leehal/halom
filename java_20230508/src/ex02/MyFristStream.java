package ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class ToyPriceInfo{
	private String model;
	private int price;
	
	public ToyPriceInfo(String model, int price) {
		this.model = model;
		this.price = price;
	}
	public int getPrice() {
		return this.price;
	}
}
public class MyFristStream {

	public static void main(String[] args) {
		List<ToyPriceInfo> list = new ArrayList<>();
		
		list.add(new ToyPriceInfo("GUN_LR_45", 200));
		list.add(new ToyPriceInfo("GUN_LR_55", 600));
		list.add(new ToyPriceInfo("TEDDY_BEAR_S_014", 350));
		list.add(new ToyPriceInfo("CAR_TRANSFORM_VER_778", 550));
		
		//장난감 가격이 500이상 제품 합은 얼마?
		int sum = list.stream().filter(n->n.getPrice()>=500)//500이상 뺴고 거르기
				.mapToInt(n->n.getPrice())//정수로 변환시키기->이름은 걸러지고 가격만 남음
				.sum();
		System.out.println(sum);
		
	}

}
