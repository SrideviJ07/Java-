import java.util.*;
public class Reversing {
    static String reverse(String s)
    {
        String d="";
      for(int i=s.length()-1;i>=0;i--)
      {
          d=d+s.charAt(i);
      }
      return d;
    }
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine(),r="",result="";
        if(s.equals("") || s.equals("\n"))
        {
            System.out.println("please enter valid num:");
            return;
        }
        for (int i =0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                result+=reverse(r)+" ";//1st else condition will get run
                r="";///for emptying the r
            }
            else{
                r=r+s.charAt(i);
            }

        }
        result+=reverse(r);
        System.out.println("words and letters rev: " + reverse(s));
        System.out.println("letters rev: " + result);
        System.out.println("words rev: " +reverse(result));
    }
}
