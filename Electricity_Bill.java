import java.util.Scanner;
public class Electricity{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ch=sc.nextLine();
        int n=sc.nextInt();
        double c;
        if(n<=199)
        {
            c=n*1.2;
        }
        else if(n<400)
        {
            c=n*1.5;
        }
        else if(n<600)
        {
            c=n*1.8;
        }
        else{
            c=n*2.0;
        }
        if(c<400)
        {
            c+=100;
        }
        else{
            c+=(c*0.15);
        }
        System.out.printf("%.2f",c);
    }
}