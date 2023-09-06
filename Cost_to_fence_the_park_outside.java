import java.util.*;
public class Cost{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int w=sc.nextInt()*2;
        int c=sc.nextInt();
        int cost=((l+w)*(b+w))-(l*b);
        System.out.print(cost*c);
    }
}