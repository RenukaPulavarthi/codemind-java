import java.util.*;
public class square{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            int k=sc.nextInt();
            arr[i]=k*k;
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}