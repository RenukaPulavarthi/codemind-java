import java.util.*;
public class Arr{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        int f=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<a || arr[i]>b)
            {
                f=1;
               System.out.print(arr[i]+" ");
            }
        }
        if(f==0)
        {
            System.out.print("-1");
        }
        
    }
} 