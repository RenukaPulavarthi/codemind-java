import java.util.Scanner;
public class Fah{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double f=sc.nextDouble();
        double c=(f-32)/1.8;
        System.out.printf("%.2f",c);
    }
}