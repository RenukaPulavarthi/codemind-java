import java.util.*;
public class Spy{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        int m=1;
        for(int i=n;i>0;)
        {
            s+=i%10;
            m*=(i%10);
            i=i/10;
        }
        if(s==m)
            System.out.print("Spy Number");
        else
            System.out.print("Not Spy Number");
    }
}