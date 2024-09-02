import java.util.*;
public class Bouncing {
    static boolean increase(String s)
    {
        //String d="";
        for(int i=0;i<s.length()-1;i++)
        {
            
             if(s.charAt(i)>s.charAt(i+1))
             {
                return false;
             }
            
        }
        return true;
    }
    static boolean decrease(String s)
    {
        //String d="";
        for(int i=0;i<s.length()-1;i++)
        {
            
             if(s.charAt(i)<s.charAt(i+1))
             {
                return false;
             }
            
        }
        return true;
    }
    public static void main(String args[])
    {
    Scanner sc =new Scanner(System.in);
    int a=sc.nextInt();
    String a1=String.valueOf(a);
    System.out.println("increasing: "+increase(a1));
    System.out.println("decreasing: "+decrease(a1));
    if(increase(a1) || decrease(a1))
    {
        System.out.println("It is not bouncing number");
    }
    else
    {
        System.out.println("It is bouncing number");
    }
    }
}
