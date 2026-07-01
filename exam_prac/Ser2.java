import java.io.*;
import java.net.*;
public class Ser2
{
    public static void main(String[]args) throws Exception
    {
        ServerSocket s1 = new ServerSocket(1234);
        while(true)
        {
        Socket s = s1.accept();
        System.out.println("Server Started");
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        String str1 = dis.readUTF();
        int charcount = 0;
        int digcount = 0;
       for(int i=0;i<str1.length();i++)
{
if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') {
charcount++;
} else if (str1.charAt(i) >= '0' && str1.charAt(i) <= '9') {
digcount++;
} else {
continue;
}
}
        dos.writeInt(charcount);
        dos.writeInt(digcount);
        }
    }
}