import java.util.*;
public class Missing{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        for(int j=0;j<k;j++)
        {
            int n=sc.nextInt();
            int c=0;
            for(int i=0;i<n-1;i++)
            {
                c+=sc.nextInt();
            }
            int m=n*(n+1)/2;
            System.out.println(m-c);
       
         }
    }
       
}