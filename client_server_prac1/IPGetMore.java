// Program to Illustrate methods of InetAddress class to find IP adress

import java.net.*;
class IPGetMore
{
    public static void main(String[]args) throws UnknownHostException
    {
        InetAddress add = InetAddress.getLocalHost();
        System.out.println("Local host of My Pc is "+add);
        add = InetAddress.getByName("google.com");
        System.out.println("IP Address of google.com is "+add);
        InetAddress nadd[] = InetAddress.getAllByName("mdismileportfolio.vercel.app");
        for(int i=0;i<nadd.length;i++)
        {
            System.out.println(nadd[i]);
        }
    }
}