import java.util.Scanner;
public class Pattern{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>0;i--)
        {
            for(int j=n;j>0;j--)
            {
                if(i==j || i+j==n+1)
                {
                    System.out.print(i+" ");
                }
                else
                {
                    System.out.print(" ");
                }
                
                
            }
            System.out.println();
        }
    }
}