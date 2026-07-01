import java.net.*;
import java.io.*;
import java.util.*;
class Try1Ser
{
public static void main(String[]args) throws Exception{
System.out.println("server Started");
ServerSocket S1 = new ServerSocket(1234);
while(true)
{
Socket l1 = S1.accept();
DataInputStream dis = new DataInputStream(l1.getInputStream());
DataOutputStream d1 = new DataOutputStream(l1.getOutputStream());
String str1,str2;
str2 = dis.readUTF();
System.out.println(str2);
Scanner input = new Scanner(System.in);
str1 = input.nextLine();
d1.writeUTF(str1);
}
}
}