import java.util.*;

public class Palindrome {
    static boolean pal(int n)
    {
        int s=n;
        int i=0;
        int rev=0;
       while(n!=0)
       {
        i=n%10;
        rev=(rev*10)+i;
        n/=10;
       }
       if(rev==s)
       {
        return true;
       }
       return false;
    }
     public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the value:");
       int a=sc.nextInt();
       System.out.println(pal(a));
    }
}
