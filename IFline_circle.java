/*crete an interface ishape having 2 prototypes draw and move .create 2 classes line and circle which implements
 above interface*/

 import java.io.*;
 interface ishape{
    public void draw();
    public void move();
 }
 class Line implements ishape
 {
    public void draw(){
        System.out.println("Line draw");
    }
    public void move(){
        System.out.println("Line move");
    }

 }

 class Circle implements ishape{
    public void draw(){
        System.out.println("Circle draw");
    }
    public void move(){
        System.out.println("Circle move");
    }
 }
class IFline_circle
{
    public static void main(String args[]){
        ishape obj;
        obj=new Line();
        obj.draw();
        obj.move();
        obj=new Circle();
        obj.draw();
        obj.move();
    }
}
