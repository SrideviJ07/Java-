import java.util.*;
public class Stringbuf {
    static StringBuffer append1(String a)
    {
        StringBuffer obj=new StringBuffer(a);
        obj.append("sridevi");
        obj.insert(1,"hi");
        obj.delete(1,2);
        obj.reverse();
        obj.replace(1,5,"good");

        return obj;
    }
    public static void main(String args[])
    {
        String s="sri devi";
        System.out.println(append1(s));
    }
}
