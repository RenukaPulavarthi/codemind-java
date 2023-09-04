import java.util.*;
public class count{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    char ch=sc.next().charAt(0);
    int c=0;
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)==ch)
        {
            c+=1;
        }
    }
    System.out.print(c==0?"-1":c);
    }
}