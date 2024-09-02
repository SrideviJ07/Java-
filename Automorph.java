import java.util.*;
public class Automorph {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int c=a*a;
     /*String e=String.valueOf(a);
     String d=String.valueOf(c);
     System.out.println(d);
     boolean h=d.endsWith(e);
     System.out.println(h);
     //h.substring(d.length(),d.length()-1);
     if(c==0)
     {
        System.out.println("it is not automorphic");

     }
     else if(h)
     {
        System.out.println("it is automorphic");
     }
     else
     {
        System.out.println("it is not automorphic");
     }*/

    System.out.println(String.valueOf(c).endsWith(String.valueOf(a)));
    }
}

