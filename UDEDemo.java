//userdefined exception.throw is UDE. first we  have to create a class which is inherited from exception
import java.util.*;
class MyEx extends Exception{
String strerror;
public MyEx(String s){
super();
strerror =s;
}
public void disp(){
s.o.p("Error" +strerror);
}
}
class UDEDemo{
public static void main(String args[]){
int a,b;
Scanner s=new Scanner(System.in);
try{
System.out.println("Enter 2 numbers");
a=s.nextInt();
b=s.nextInt();
if(b==0){
throw new MyEx("Dr 0 not possible");
}
c=a/b;
System.out.println("c "+c);
}
catch(MyEx m){
m.disp();
}
