import java.util.Scanner;
public class Capacity{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        long cap=a*b*c*2*512;
        System.out.println(cap);
    }
}