import java.util.Scanner;
public class Numbers{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=0;
        for(int i=0;i<n;i++)
        {
            int c=0;
            while(arr[i]!=0)
            {
                c+=1;
                arr[i]/=10;
            }
            if(c%2==0)
               k+=1;
        }
        System.out.print(k);
    }
}