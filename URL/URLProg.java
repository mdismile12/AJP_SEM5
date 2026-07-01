import java.net.*;
class URLProg
{
    public static void main(String[]args) throws Exception
    {
        URL u1 = new URL("https://www.google.com");
        System.out.println(" class :-"+u1.getClass());
        System.out.println(" port : "+u1.getDefaultPort());
        System.out.println(" Protocol :-"+u1.getProtocol());
    }
}