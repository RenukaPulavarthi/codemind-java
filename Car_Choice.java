import java.util.Scanner;
public class Car{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        for(i=0;i<n;i++)
        {
            double c=sc.nextDouble();
            double d=sc.nextDouble();
            double a=sc.nextDouble();
            double b=sc.nextDouble();
            if (a/c < b/d)
            {
                System.out.println("-1");
            }
            else if(a/c == b/d)
            {
                System.out.println("0");
            }
            else{
                System.out.println("1");
            }
        }
    }
}