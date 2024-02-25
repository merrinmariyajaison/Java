import java.io.*;
class CRead
{
   public static void main(String arg[])
    {
      DataInputStream din;
      String name;
      int age;
      String s;
     din= new DataInputStream(System.in);
     try{
       System.out.println("Enter your name");
       name = din.readLine();  //readLine is an inbuilt function of DataInputStream class.
       System.out.println("Enter your age");
       s=din.readLine();
       age = Integer.parseInt(s);
       System.out.println("Name "+name);
       System.out.println("age "+age);
       }
     catch(Exception e)
     {
       System.out.println("Error  "+e);
     }
}
}
