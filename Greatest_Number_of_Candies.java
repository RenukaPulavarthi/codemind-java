import java.util.*;
public class greatest{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr= new int[n];
        int m=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(m<arr[i])
            {
                m=arr[i];
            }
        }
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]+k>=m)
            {
                System.out.print("True"+" ");
            }
            else
            {
                System.out.print("False"+" ");
            }
        }
    }
}