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
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==m)
            {
                c+=1;
            }
        }
        System.out.print(c);
    }
}