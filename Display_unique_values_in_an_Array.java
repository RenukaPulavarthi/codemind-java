import java.util.*;
public class Sum{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int f,k=0;
        for(int i=0;i<n;i++)
        {
            f=0;
            for(int j=0;j<n;j++)
            {
                if(arr[j]==arr[i])
                {
                    f+=1;
                }
            }
            if(f==1)
            {
                k=1;
                System.out.print(arr[i]+" ");
            }
        }
        if(k==0)
            System.out.print("-1");
    }
}