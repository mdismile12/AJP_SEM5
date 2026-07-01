// Server side program:-
import java.net.*;
import java.io.*;
class SerP2U
{
    public static void main(String[]args) throws Exception{
        BufferedReader b2 = new BufferedReader(new InputStreamReader(System.in));
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
        System.out.println("received msg from client is "+str3);
        InetAddress add2 = p3.getAddress();
        int port = p3.getPort();
        String str4 = b2.readLine();
        out = str4.getBytes();
        DatagramPacket p4 = new DatagramPacket(out,out.length,add2,port);
        ser.send(p4);
    }
    }
    
}