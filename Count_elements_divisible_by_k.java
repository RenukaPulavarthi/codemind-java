import java.util.Scanner;
public class Even{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%k==0)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}