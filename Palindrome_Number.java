import java.util.Scanner;
public class Pali{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int k=sc.nextInt();
            int m=k;
            int s=0;
            while(m>0)
            {
                s=(s*10)+m%10;
                m=m/10;
            }
            System.out.println(k==s?"True":"False");
        }
    }
}