import java.util.*;

class Rectangle{
	float length, breadth, area, perimeter;
	public Rectangle(){
		length = 0;
		breadth = 0;
		calcArea();
		calcPerimeter();
	}
	public Rectangle(float l, float b){
		length = l;
		breadth = b;
		calcArea();
		calcPerimeter();
	}
	public void calcArea(){
		area = length*breadth;
	}
	public void calcPerimeter(){
		perimeter = 2*(length+breadth);
	}
	public int sameArea(Rectangle r){
		if(r.area == area)
			return 1;
		else
			return 0;	
	}
}

class RectangleSameArea{
	public static void main(String args[]){
		System.out.println("1st Rectangle: Length = 10, Breadth = 20");
		System.out.println("1st Rectangle: Length = 5, Breadth = 40");
		Rectangle r1 = new Rectangle(10,20);
		Rectangle r2 = new Rectangle(5,40);
		System.out.println("1st Rectangle: Area = "+r1.area+", Perimeter = "+r1.perimeter);
		System.out.println("2nd Rectangle: Area = "+r2.area+", Perimeter = "+r2.perimeter);
		if(r1.sameArea(r2) == 1)
			System.out.println("\nBoth Rectangles have equal area!");
		else
			System.out.println("\nBoth Rectangles have different area!");
	}
}