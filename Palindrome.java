import java.util.Scanner;
public class Pali{
    public static int palindrome(int n)
    {
        int k=n;
        int s=0;
        while(k!=0)
        {
            s=(s*10)+(k%10);
            k=k/10;
        }
        if(s==n)
            return 2;
        else
            return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(palindrome(n)==2)
        {
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}