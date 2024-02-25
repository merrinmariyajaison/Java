import java.io.*;
import java.net.*;         //import package
class Server{
public static void main(String args[]){
    ServerSocket ss;    //There is only one server socket
    Socket as;          //Each client needs a Socket
    DataInputStream sin;
    DataOutputStream sout;
    try{
        ss=new ServerSocket(1234);   //1234 is port number
        as=ss.accept();     //accept() is a method of class ServerSocket.It waits until a client socket gets connected
        sin = new DataInputStream(as.getInputStream());
        sout = new DataOutputStream(as.getOutputStream());
        sout.writeUTF("Welcome client");
        String str=sin.readUTF();
        System.out.println("Client says :"+str);
        System.in.read();
       }
       catch(Exception e){
        System.out.println("Error"+e);
       }
}
}