import java.util.Scanner;
public class EvenOdd{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String s= (a%2==0)?"Even":"Odd" ;
        System.out.println(s);
    }
}