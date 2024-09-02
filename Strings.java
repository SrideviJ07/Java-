import java.util.*;
public class Strings {
    public static void main(String args[])
    {
        String s="Welcome to KCG",r=" ",m=" ",n=" ";
        for(int i=(s.length()-1);i>=0;i--)
        {
             r=r+s.charAt(i);
        }
        System.out.println(r.toString());
       
       String g[]=s.split(" ");
       //System.out.println(g.length());
       for(int i=(g.length-1);i>=0;i--)
        {
             m=m+g[i]+" ";
        }
       
        System.out.println(m.toString());
        for(int i=(g.length-1);i>=0;i--)
        {
            n=n+s.charAt(i);
        }
        System.out.println(n.toString());
    }
}
