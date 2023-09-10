import java.util.*;
public class Sum{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int s=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                int k=sc.nextInt();
                s+=k;
            }
        }
        System.out.print(s);
    }
}