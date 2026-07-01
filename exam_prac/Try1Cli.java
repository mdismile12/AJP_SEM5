import java.net.*;
import java.io.*;
import java.util.*;
class Try1Cli
{
public static void main(String[]args) throws Exception{
while(true)
{
Socket s1 = new Socket("localhost",1234);
DataInputStream dis = new DataInputStream(s1.getInputStream());
DataOutputStream d1 = new DataOutputStream(s1.getOutputStream());
String str1,str2;
Scanner input = new Scanner(System.in);
str1 = input.nextLine();
d1.writeUTF(str1);
str2 = dis.readUTF();
System.out.println(str2);
s1.close();
}
}
}