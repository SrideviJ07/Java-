import java.util.*;
public class Prime {
    static boolean prime1(int n)
    {
       if(n<2)
       {
        return false;
       }
       for(int i=2;i<=n/2;i++)
       {
        if(n%i==0)
        {
            return false;
        }
       }
       return true;
    }
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the value:");
       int a=sc.nextInt();
       System.out.println(prime1(a));
    }
}
