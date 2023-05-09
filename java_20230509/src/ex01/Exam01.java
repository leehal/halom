package ex01;

interface Shape {
	double getArea();
}

class Rectangle implements Shape{
	int width;
	int height;
	@Override
	public double getArea() {
		return width*height;
	}
	public Rectangle(int width,int height) {
		this.width=width;
		this.height= height;
	}
}
class Circle implements Shape{
	int r;
	@Override
	public double getArea() {
		return 3.14*r*r;
	}
	public Circle(int r) {
		this.r= r;
	}
}
public class Exam01 {

	public static void main(String[] args) {
		Rectangle rec= new Rectangle(3,5);
		rec.getArea();
		Circle c = new Circle(8);
		c.getArea();
		
		System.out.println("사각형면적 "+rec.getArea());
		System.out.println("원면적 "+c.getArea());
	}

}
