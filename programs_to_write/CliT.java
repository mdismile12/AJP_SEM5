// Client side Program
import java.net.*;
import java.io.*;
class CliT
{
    public static void main(String[]args) throws Exception{
    while(true)
    {
        System.out.println("Enetr 2 numbers");
        Socket s1 = new Socket("localhost",1234);
        BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
        DataOutputStream d1 = new DataOutputStream(s1.getOutputStream());
        BufferedReader b2 = new BufferedReader(new InputStreamReader(s1.getInputStream()));
        
        String str1 ="";
        String str2;
        for(int i=0;i<2;i++)
        {
            System.out.println("Enter Numbers put / at end");
            str1 = str1 + b1.readLine();
        }
        d1.writeBytes(str1+"\n");
        str2 = b2.readLine();
        System.out.println("Sum of given Numbers are");
        System.out.println(str2);
        s1.close();
    }
    }
}