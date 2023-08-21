import java.util.Scanner;
public class gre{
    public static int prime(int n)
    {
        if(n==1)
            return 1;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return 1;
            }
        }
        return 2;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<=k)
            {
                if(prime(a[i])==2)
                {
                    c+=1;
                }
            }
        }
        System.out.print(c);
    }
}