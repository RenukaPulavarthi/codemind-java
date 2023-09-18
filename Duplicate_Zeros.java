import java.util.*;
public class Dupli{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int i=0;
       while(i<n)
        {
            if(arr[i]==0)
            {
                int j=n-1;
                while(j>i+1)
                {
                    arr[j]=arr[j-1];
                    j-=1;
                }
                arr[i+1]=0;
                i+=2;
            }
            else{
                i+=1;
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}