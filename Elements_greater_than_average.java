import java.util.*;
public class ele{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int s=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            s+=arr[i];
        }
        int avg=s/n;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=avg)
            {
                c+=1;
            }
        }
        System.out.print(c);
    }
}