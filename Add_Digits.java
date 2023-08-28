import java.util.Scanner;
public class AddDigits{
    public static int Add(int n)
    {
        int s=0;
        while(n>0)
        {
            s+=(n%10);
            n=n/10;
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>9)
        {
            n=Add(n);
        }
        System.out.print(n);
    }
}