import java.util.Scanner;
public class area{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        double area=3.14*r*r;
        System.out.printf("%.2f",area);
    }
}