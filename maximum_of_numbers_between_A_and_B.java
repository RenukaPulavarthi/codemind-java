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
        int maxx=0;
        for(int i=0;i<n;i++)
        {
            if (ar[i]>=a && ar[i]<=b)
            {
                if (maxx<ar[i])
                {
                    maxx=ar[i];
                }
            }
        }
        if(maxx==0)
            System.out.print("-1");
        else
             System.out.print(maxx);
    }
}