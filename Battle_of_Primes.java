import java.util.Scanner;
public class Prime{
    public static boolean Isprime(int n)
    {
        if(n==1)
            return false;
        else{
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                    return false;
            }
        }
        return true;
    }
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int k=a+b+1;
        while(k>0)
        {
            if(Isprime(k)==true)
            {
                break;
            }
            k+=1;
        }
        System.out.print(k-(a+b));
    }
}