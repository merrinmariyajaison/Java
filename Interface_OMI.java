//An interface method can invoke other methods present in the class(other methd invocation by interface methods)
import java.io.*;
interface i1
{
    public void disp();
    public void print();
}
class c1 implements i1{
    public void disp(){
        System.out.println("Interface disp");
    }
    public void print(){
        draw();
        System.out.println("Interface print");
    }
    public void draw(){
        System.out.println("Draw not in interface");
    }
    
}

class Interface_OMI{
 public static void main(String args[]){
  i1 obj;
  obj = new c1();
  obj.disp();
  obj.print();
}
}