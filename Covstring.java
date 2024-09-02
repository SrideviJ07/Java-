import java.util.*;
public class Covstring {
    static String string(StringBuilder a)
    {
       
    }
    static StringBuffer buf (String a)
    {
       StringBuffer obj=new StringBuffer(a);
       obj.append("kikibiki");
       return obj;
    }
    static StringBuilder build (String a)
    {
       StringBuilder obj=new StringBuilder(a);
       return obj;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        sc.close();
        String s=sc.nextLine();
        StringBuilder obj1=new StringBuilder();
        System.out.println(build(s));
        System.out.println(buf(s));
        
        

    }
}
