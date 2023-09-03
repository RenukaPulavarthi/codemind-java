import java.util.*;
public class Avg{
    public static boolean prime(int n)
    {
        if(n<=1)
            return false;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double s=0,c=0;
        for(int i=0;i<n;i++)
        {
            int k=sc.nextInt();
            if(prime(k)==true)
            {
                s+=k;
                c+=1;
            }
        }
        System.out.printf("%.2f",s/c);
    }
}