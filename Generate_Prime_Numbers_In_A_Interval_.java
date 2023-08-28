import java.util.Scanner;
public class Generete{
    public static boolean prime(int n)
    {
        if(n==1)
          return false;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=n;i<=m;i++)
        {
            if(prime(i)==true)
            {
                System.out.println(i);
            }
        }
    }
}