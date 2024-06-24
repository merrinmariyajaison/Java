import java.util.*;

class Rectangle{
	float length, breadth, area, perimeter;
	public Rectangle(int l, int b){
		length = l;
		breadth = b;
		area = length*breadth;
		perimeter = 2*(length+breadth);
	}
}

class RectangleMain{
	public static void main(String args[]){
		System.out.println("1st Rectangle: Length = 10, Breadth = 20");
		System.out.println("1st Rectangle: Length = 5, Breadth = 40");
		Rectangle r1 = new Rectangle(10,20);
		Rectangle r2 = new Rectangle(5,40);
		System.out.println("1st Rectangle: Area = "+r1.area+", Perimeter = "+r1.perimeter);
		System.out.println("2nd Rectangle: Area = "+r2.area+", Perimeter = "+r2.perimeter);
		if(r1.area == r2.area)
			System.out.println("\nBoth Rectangles have equal area!");
		else
			System.out.println("\nBoth Rectangles have different area!");
	}
}