import java.util.*;
public class Swap {
    static void swapp(String a,String b)
    {
        a=a.concat(b);
       b=a.substring(0,(a.length()-b.length()));
       a=a.substring(b.length());
       System.out.println("a:"+a+"\nb:"+b);
    }
    public static void main(String args[])
    {
       String s="sridevi";
       String d="sangeetha";
       swapp(s,d);
    }
}
