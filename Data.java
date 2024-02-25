import java.io.*;
class Data{
    public static void main(String args[]){
 DataInputStream din;   //DataInputStream  is an inbuilt class and  din is an object/variable/instance  of that class
din = new DataInputStream(System.in); 
try{
    System.out.println("Enter your name");
String name = din.readLine();                   //Here readLine is an inbuilt function.
System.out.println("Enter your number");
String sno = din.readLine();
int number =Integer.parseInt(sno);

}                                       //new is an operator used for allocating memory dynamically for the object.

catch(Exception e)
{
    System.out.println("Error"+ e);
}
}
   


}

