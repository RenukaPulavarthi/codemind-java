import java.util.*;
public class CollatzSequence{
    public static int collatz(int n)
    {
        int c=0;
        while(n!=1)
        {
          c++;
          if(n%2==0)
          {
              n=n/2;
          }
          else{
              n=3*n+1;
          }
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int ma=0,ele=0;
        for(int i=n;i<=m;i++)
        {
            if(collatz(i)>ma)
            {
                ma=collatz(i);
                ele=i;
            }
        }
        System.out.print(ele);
        
    }
}