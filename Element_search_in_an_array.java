import java.util.*;
public class Last{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int k=0;
        for(int i=n-1;i>0;i--)
        {
            if(a[i]==m)
            {
                k=1;
                break;
            }
        }
        System.out.print(k==0?"False":"True");
    }
}