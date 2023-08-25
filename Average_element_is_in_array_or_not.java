import java.util.*;
public class Average{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int s=0;
        for(int i=0;i<n;i++)
        {
            s+=a[i];
        }
        int avg=s/n;
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(avg==a[i])
            {
                k=1;
            }
        }
        System.out.print(k==0?"False":"True");
    }
}