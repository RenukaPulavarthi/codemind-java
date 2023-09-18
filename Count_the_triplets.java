import java.util.*;
public class Trip{
    static boolean check(int[] arr,int n,int k)
    {
        for(int i=0;i<n;i++)
        {
            if (arr[i]==k)
                return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        for(int l=0;l<s;l++)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int c=0;
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(check(arr,n,arr[i]+arr[j])==true)
                    {
                        c+=1;
                    }
                }
            }
            System.out.println(c>0?c:"-1");
        }
    }
}