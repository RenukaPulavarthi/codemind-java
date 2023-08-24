import java.util.*;
public class maximum
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=s.nextInt();
        }
        int a=s.nextInt();
        int b=s.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if (ar[i]>=a && ar[i]<=b)
            {
                sum+=ar[i];
            }
        }
        System.out.print(sum);
    }
}