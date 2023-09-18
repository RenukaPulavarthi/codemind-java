import java.util.Scanner;
public class circular{
    public static int prime(int n)
    {
        if(n==1)
            return 0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(prime(n)==1)
        {
            int s=0;
            for(int i=n;i>0;)
            {
                s=(s*10)+(i%10);
                i=i/10;
            }
            if(prime(s)==1)
            {
                System.out.print("circular prime");
            }
            else{
                System.out.print("prime but not a circular prime");
            }
        }
        else{
            System.out.print("not prime");
        }
    }
}
