//Program to Display Sum of 2 numbers received from client
// Server side Program
import java.net.*;
import java.io.*;
import java.lang.*;

class SerT
{
    public static void main(String[]args) throws Exception{
        System.out.println("server Started");
        ServerSocket S1 = new ServerSocket(1234);
        String []temp;
        int a[] = new int [2];
        String str1 ="";
        String del = "/";
    while(true)
    {
        Socket l1 = S1.accept();
        
        
        BufferedReader cli = new BufferedReader(new InputStreamReader(l1.getInputStream()));
        DataOutputStream clio = new DataOutputStream(l1.getOutputStream());
        str1 = cli.readLine();
        temp = str1.split(del);
        int sum = 0;
        System.out.println("Numbers received are");
        for(int i=0;i<2;i++)
        {
            System.out.println(temp[i]+" ");
            sum = sum + Integer.parseInt(temp[i]);
        }
        String str2 = String.valueOf(sum);
        clio.writeBytes(str2+"\n");
        
    }
    }
    
}