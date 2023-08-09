import java.util.Scanner;
public class Clim{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i;
        for(i=0;i<N;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a%b==0)
            {
                System.out.println(a/b);
            }
            else{
                System.out.println((a/b)+(a%b));
            }
        }
    }
}