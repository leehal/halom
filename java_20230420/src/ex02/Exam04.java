package ex02;

import java.util.Arrays;

class Buyer{
	int money=1000;
	Product []cart = new Product[3];
	int i=0;
	
	void buy (Product p) {
		if(money<=p.price) 
			System.out.println("끝");
		else {
			this.money -= p.price;
			add(p);}
	}
	void add (Product p) {
		if(i>=cart.length) {
			Product []cart2 = new Product[cart.length*2];
			System.arraycopy(cart, 0, cart2, 0,cart.length );
			cart=cart2;
		}
		cart[i]=p;
		i++;
	}
	void summary() {
		System.out.println(Arrays.toString(cart));
		System.out.println(money);
			}
	}
class Product{
	int price;
	Product(int price){this.price=price;}
}
class Tv extends Product{
	Tv() {super(100);}
	public String tostring() {return "Tv";}
}
class Computer extends Product{
	Computer() {super(200);}
	public String tostring() {return "Computer";}
}
class Audio extends Product{
	Audio() {super(50);}
	public String tostring() {return "Audio";}
}
public class Exam04 {

	public static void main(String[] args) {
		Buyer b =new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.buy(new Audio());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		
		
		b.summary();

	}

}