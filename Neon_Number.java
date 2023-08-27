import java.util.Scanner;
public class Number{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        for(int i=n*n;i>0;)
        {
            s+=(i%10);
            i=i/10;
        }
        System.out.print(s==n?"Neon Number":"Not Neon Number");
    }
}