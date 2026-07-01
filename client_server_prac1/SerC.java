import java.net.*;
import java.io.*;
import java.util.*;

class SerC
{
    public static void main(String[] args) throws Exception {
        System.out.println("server Started");
        ServerSocket S1 = new ServerSocket(1234);
        while (true) {
            Socket l1 = S1.accept();
            Scanner sc = new Scanner(l1.getInputStream());
            PrintStream ps = new PrintStream(l1.getOutputStream());

            String str1 = sc.nextLine();
            int charcount = 0;
            int digitcount = 0;
            for(int i=0;i<str1.length();i++)
            {

            if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') {
                    charcount++;
            } else if (str1.charAt(i) >= '0' && str1.charAt(i) <= '9') {
                digitcount++;
            } else {
                continue;
            }
            }
            ps.println("No. of digit in string is  "+ digitcount +  "  || No. of Char in String is "+ charcount);
            sc.close();
            ps.close();
            l1.close();
        }
    }
}