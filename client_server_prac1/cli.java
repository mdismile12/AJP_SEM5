// Client side program:-
import java.net.*;
import java.io.*;
class cli
{
    public static void main(String[]args) throws Exception{
    while(true)
    {
        System.out.println("enter string");
        Socket s1 = new Socket("localhost",1234);
        BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader b2 = new BufferedReader(new InputStreamReader(s1.getInputStream()));
        DataOutputStream d1 = new DataOutputStream(s1.getOutputStream());
        String str1,str2;
        str1 = b1.readLine();
        d1.writeBytes(str1+"\n");
        str2 = b2.readLine();
        System.out.println(str2);
        System.out.println();
        s1.close();
    }
    }
    
}