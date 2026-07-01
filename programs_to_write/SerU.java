// Server side program:-
import java.net.*;
import java.io.*;
class SerU
{
    
        
    public static void main(String[]args) throws Exception{
        InetAddress add = InetAddress.getLocalHost();
        DatagramSocket ser = new DatagramSocket(1234);
        byte out[] = new byte[1024];
        byte in[] = new byte[1024];
        System.out.println("Server Started");
    while(true)
    {
        DatagramPacket p3 = new DatagramPacket(in,in.length);
        ser.receive(p3);
        String str3 = new String(p3.getData());
        System.out.println("received String is "+str3);
        InetAddress add2 = p3.getAddress();
        int port = p3.getPort();
        String str4 = str3.toUpperCase();
        out = str4.getBytes();
        DatagramPacket p4 = new DatagramPacket(out,out.length,add2,port);
        ser.send(p4);
    }
    }
    
}