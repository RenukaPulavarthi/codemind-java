import java.util.Scanner;
public class Car{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b)
        {
            System.out.println("-1");
        }
        else{
            int k=0;
            while(c>=0)
            {
               c=c-(b-a);
               k+=1;
            }
             System.out.println(k);
        }
    }
}