import java.util.*;
public class Missing{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        for(int i=0;i<n-1;i++)
        {
            k+=sc.nextInt();
        }
        int mis=n*(n+1)/2;
        System.out.print(mis-k);
        
    }
}