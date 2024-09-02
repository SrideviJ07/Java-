import java.util.*;
class Student {
    int a,b,c;
}
public class Avg{
    public static void main(String args[])
{
        Student stu=new Student();
        stu.a=56;
        stu.b=60;
        stu.c=(stu.a+stu.b)/2;
        System.out.println(stu.c);
        
    }
}