import java.util.Scanner;
public class Majority{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ele=arr[0];
        int c=0;
        for(int i=0;i<n;i++)
        {
            int k=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    k++;
                }
            }
            if(k==c)
            {
                if(ele>arr[i])
                {
                    ele=arr[i];
                }
            }
            if(k>c)
            {
                c=k;
                ele=arr[i];
            }
        }
        System.out.print(ele);
    }
}