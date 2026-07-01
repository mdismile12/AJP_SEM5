// Program to find IP address using InetAddress class

import java.net.*;
class IPGet
{
    public static void main(String[]args) throws UnknownHostException
    {
        InetAddress add = InetAddress.getLocalHost();
        System.out.println("Local host of My Pc is "+add);

    }
}