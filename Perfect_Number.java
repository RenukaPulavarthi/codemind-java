import java.util.Scanner;
public class Perfect{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                c+=i;
            }
        }
        System.out.print(c==n?"True":"False");
    }
}