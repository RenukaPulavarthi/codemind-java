import java.util.Scanner;
public class Pattern{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=65;i<n+65;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.printf("%c ",i);
            }
            System.out.println();
        }
    }
}