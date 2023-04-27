package ex01;


import java.util.Objects;

class Point{

//private static final String equals = null;

private int xPos;

private int yPos;


public Point(int xPos,int yPos) {

this.xPos = xPos;

this.yPos = yPos;


System.out.println();


}

@Override

public boolean equals(Object obj) {

Point po = (Point)obj;

if(this.xPos==po.xPos && this.yPos==po.yPos)

return true;

return false;

}

}

class Rectangle{

private Point uperLeft;

private Point lowerRight;


public Rectangle(int x1,int y1,int x2,int y2) {

uperLeft = new Point(x1, y1);

lowerRight= new Point(x2, y2);



}

@Override

public boolean equals(Object obj) {

if (this == obj)

return true;
//
//if (obj == null)
//
//return false;
//
//if (getClass() != obj.getClass())
//
//return false;

Rectangle other = (Rectangle) obj;

return (this.lowerRight==other.lowerRight) && (this.uperLeft== other.uperLeft);

}
//@Override
//
//public boolean equals(Object obj) {
//	
//	if (this == obj)
//		
//		return true;
//	
//	if (obj == null)
//		
//		return false;
//	
//	if (getClass() != obj.getClass())
//		
//		return false;
//	
//	Rectangle other = (Rectangle) obj;
//	
//	return Objects.equals(lowerRight, other.lowerRight) && Objects.equals(uperLeft, other.uperLeft);
//	
//}

}

public class Exam {

public static void main(String[] args) {

Point po =new Point(3, 3);

Point po2 =new Point(3, 3);


System.out.println(po==po2);

System.out.println(po.equals(po2));


Rectangle re =new Rectangle(3, 3, 20, 10);

Rectangle re2 =new Rectangle(3, 3, 20, 10);


System.out.println(re==re2);

System.out.println(re.equals(re2));



}

}