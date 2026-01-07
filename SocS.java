import java.net.*;
import java.io.*;
class SocS
{
    public static void main(String[]args) throws Exception{
        System.out.println("server Started");
        ServerSocket S1 = new ServerSocket(1234);
    while(true)
    {
        Socket l1 = S1.accept();
        
        
        BufferedReader cli = new BufferedReader(new InputStreamReader(l1.getInputStream()));
        BufferedReader ser = new BufferedReader(new InputStreamReader(System.in));
        DataOutputStream clio = new DataOutputStream(l1.getOutputStream());
        String str1,str2;
        str1 = cli.readLine();
        System.out.println(str1);
        str2 = ser.readLine();
        clio.writeBytes(str2+"\n");
        
    }
    }
    
}