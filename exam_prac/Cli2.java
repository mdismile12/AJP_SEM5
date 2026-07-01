import java.util.*;
import java.io.*;
import java.net.*;
public class Cli2
{
    public static void main(String[]args) throws Exception
    {
        Socket s1 = new Socket("localhost",1234);
        DataInputStream dis = new DataInputStream(s1.getInputStream());
        DataOutputStream dos = new DataOutputStream(s1.getOutputStream());
        System.out.println("Enter Num");
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        dos.writeUTF(str1);
        int chr = dis.readInt();
        int dig = dis.readInt();
        System.out.println("Charter count is "+chr+" Dig count is "+dig);
    }
}