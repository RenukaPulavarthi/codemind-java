import java.util.*;
public class Summ{
    public static boolean perfect(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(i*i==n)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int s=0;
        for(int i=0;i<n;i++)
        {
            if(perfect(arr[i])==true)
            {
                s+=arr[i];
            }
        }
        System.out.print(s);
    }
}