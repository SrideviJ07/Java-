import java.util.*;
public class Join
{
    String join1(String s,String ...s1 )
    {
        String d="";
        for(String i:s1)
        {
            d=d+i+s;
        }
        return d;
    }
    public static void main(String args[])
    {
     Join obj=new Join();
     String s=obj.join1(" ","sri","devi","student","of","kcg");
     System.out.println(s);

    } 
}