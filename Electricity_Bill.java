import java.util.*;
public class ElectricityBill{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Units Consumed: "+a);
        double c;
        if(a<=199)  c=1.2;
        else if(a<400)  c=1.4;
        else if(a<600)  c=1.6;
        else if(a<800)  c=1.8;
        else    c=2;
        System.out.printf("Cost per Unit: %.2f
",c);
        double b=c*a;
        System.out.printf("Bill: %.2f
",b);
        double s=0;
        if(b>400)
            s=b*0.15;
        System.out.printf("Surcharge: %.2f
",s);
        System.out.printf("Total Amount: %.2f
",s+b);
    }
}