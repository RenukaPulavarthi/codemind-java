import java.util.*;
public class mega{
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
        if(prime(n)==true)
        {
            int k=1;
            while(n>0)
            {
                if(prime(n%10)==false)
                {
                    k=0;
                    System.out.print("Not Mega Prime");
                    break;
                }
                n=n/10;
            }
            if(k==1)
            {
                System.out.print("Mega Prime");
            }
        }
        else{
            System.out.print("Not Mega Prime");
        }
    }
}