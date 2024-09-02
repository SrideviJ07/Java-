import java.util.*;
public class Vowstr {
    static StringBuffer checkvow(String a)
    {
        StringBuffer obj=new StringBuffer(a);
        StringBuffer obj1=new StringBuffer();
        for(int i=0;i<a.length();i++)
        {
        if(obj.charAt(i)!='a'&&obj.charAt(i)!='e'&&obj.charAt(i)!='i'&&obj.charAt(i)!='o'&&obj.charAt(i)!='u')
        {
            obj1.append(obj.charAt(i));
        }
        }
        return obj1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //sc.close();
        String s=sc.nextLine();
        System.out.println(checkvow(s));
    }
}
