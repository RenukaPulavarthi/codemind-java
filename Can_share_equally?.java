import java.util.Scanner;
public class Equally{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    if(a>0 && a%2==0)
    {
        System.out.println("YES");
    }
    else if(a%2==0 && b%2==0)
    {
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }
   }
}