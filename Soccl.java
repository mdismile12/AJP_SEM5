import java.net.*;
import java.io.*;
class Soccl
{
    public static void main(String[]args) throws Exception{
    while(true)
    {
        Socket s1 = new Socket("localhost",1234);
        BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader b2 = new BufferedReader(new InputStreamReader(s1.getInputStream()));
        DataOutputStream d1 = new DataOutputStream(s1.getOutputStream());
        String str1,str2;
        str1 = b1.readLine();
        d1.writeBytes(str1+"\n");
        str2 = b2.readLine();
        System.out.print(str2);
        s1.close();
    }
    }
    
}