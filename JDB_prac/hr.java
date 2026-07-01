class hr
{
    public static void main(String[]args)
    {
        int n= 4;
        for(int i = n;i>=1;i--)
        {
            for(int j= 1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if((i==n && j==1))
                {
                    System.out.print("  ");

                    continue;
                
                }
                if(i==n && j==n)
                {
                    System.out.print(" ");
                    continue;
                }
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}