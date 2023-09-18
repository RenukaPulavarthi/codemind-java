import java.util.*;
public class Pro{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        for(int i=1;i<n/2;i++)
        {
            if(i*(i+1)==n)
            {
                k=1;
                System.out.print("YES");
                break;
            }
        }
        if(k==0)
            System.out.print("NO");
    }
}