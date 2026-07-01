// Client side Program
import java.net.*;
import java.io.*;
class CliP2U
{
    public static void main(String[]args) throws Exception{
    while(true)
    {
        System.out.println("enter your msg:- ");
        BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
        InetAddress add = InetAddress.getLocalHost();
        DatagramSocket clis = new DatagramSocket();
        byte out[] = new byte[1024];
        byte in[] = new byte[1024];
        String str = b1.readLine();
        out = str.getBytes();
        DatagramPacket p1 = new DatagramPacket(out,out.length,add,1234);
        clis.send(p1);
        DatagramPacket p2 = new DatagramPacket(in,in.length);
        clis.receive(p2);
        String str2 = new String(p2.getData());
        System.out.println("received msg from server:- "+str2);
        clis.close();
    }
    }
    
}