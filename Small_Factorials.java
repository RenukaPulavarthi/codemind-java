import java.util.Scanner;
public class Factorial{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int k=sc.nextInt();
            int m=1;
            for(int j=1;j<=k;j++)
            {
                m*=j;
            }
            System.out.println(m);
        }
    }
}