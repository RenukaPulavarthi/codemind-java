import java.util.Scanner;
public class CelsiusToFehrenheit{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double c=sc.nextDouble();
        double f=(c*1.8)+32;
        System.out.printf("%.2f",f);
    }
}