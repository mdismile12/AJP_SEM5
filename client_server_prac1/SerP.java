import java.net.*;
import java.io.*;
import java.util.*;

class SerP
{
    public static void main(String[] args) throws Exception {
        System.out.println("server Started");
        ServerSocket S1 = new ServerSocket(1234);
        while (true) {
            Socket l1 = S1.accept();
            Scanner sc = new Scanner(l1.getInputStream());
            PrintStream ps = new PrintStream(l1.getOutputStream());

            String str1 = sc.nextLine();
            int nn = Integer.parseInt(str1);

            if (nn > 0) {
                ps.println("number is positive");
            } else if (nn < 0) {
                ps.println("number is negative");
            } else {
                ps.println("number is zero");
            }

            sc.close();
            ps.close();
            l1.close();
        }
    }
}