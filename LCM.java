import java.util.Scanner;
public class Lcm{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int ma=n>m?n:m;
        while(ma>0)
        {
            if(ma%n==0 && ma%m==0)
            {
                System.out.print(ma);
                break;
            }
            ma+=1;
        }
    }
}