import java.util.*;
public class Strong{
    static int fac(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f*=i;
        }
        return f;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        for(int i=n;i>0;)
        {
            s+=fac(i%10);
            i=i/10;
        }
        if(s==n)
            System.out.print("The number "+n+" is a strong number");
        else
            System.out.print("The number "+n+" is not a strong number");
    }
}