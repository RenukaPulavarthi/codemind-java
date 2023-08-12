import java.util.Scanner;
public class positive{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt();
        if(k>0)
        {
            System.out.println("Positive Number");
        }
        else{
            System.out.println("Negative Number");
        }
    }
}