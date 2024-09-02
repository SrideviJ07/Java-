import java.util.*;
public class Stringbuild {
    static StringBuilder append1(String a)
    {
        StringBuilder obj=new StringBuilder(a);
        obj.append(" student");
        obj.append(" student");
        obj.append(" student");
        obj.append(" student");
        obj.insert(1,"hi");
        obj.delete(1,2);
        obj.reverse();
        obj.replace(4,5,"good");

        return obj;
    }
    public static void main(String args[])
    {
        String s="sri devi";
        System.out.println(append1(s));
    }
}
