import java.util.Scanner;
public class area{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        float k;
        k=(float)(a+b+c)/2;
        double m=Math.sqrt(k*(k-a)*(k-b)*(k-c));
        System.out.printf("%.2f",m);
    }
}