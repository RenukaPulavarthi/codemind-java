import java.util.*;
public class Count{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int e=0,o=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                e+=1;
            }
            else{
                o+=1;
            }
        }
        System.out.print(e+" "+o);
    }
}