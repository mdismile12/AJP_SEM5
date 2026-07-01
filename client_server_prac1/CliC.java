import java.net.*;
import java.io.*;
import java.util.*;

class CliC
{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        while (true) {
            Socket s1 = new Socket("localhost", 1234);
            PrintStream ps = new PrintStream(s1.getOutputStream());
            Scanner sc = new Scanner(s1.getInputStream());
            System.out.println("Enter String");
            String str1 = input.nextLine();
            ps.println(str1);

            String str2 = sc.nextLine();
            System.out.println(str2);

            ps.close();
            sc.close();
            s1.close();
        }
    }
}