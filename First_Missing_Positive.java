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
        int f,i=1;
        while(i>0)
        {
            f=0;
            for(int j=0;j<n;j++)
            {
                if(arr[j]==i)
                {
                    f=1;
                }
            }
            if(f==0)
            {
                System.out.print(i);
                break;
            }
            i+=1;
        }
    }
}