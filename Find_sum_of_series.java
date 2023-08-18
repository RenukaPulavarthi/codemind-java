import java.util.Scanner;
public class Sum{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double s=0,i;
        for(i=1;i<=n;i++)
        {
            s+=(1/i);
        }
        System.out.printf("%.2f",s);
    }
}