import java.util.*;
class Student2 implements Comparable<Student2>
{
    int rolenum;
    String name;
    char grade;
    Student2()
    {
        System.out.println("Welcome to the school");
    }
    Student2(int rolenum,String name,char grade)
    {
        this.rolenum=rolenum;
        this.name=name;
        this.grade=grade;
    }
    void display()
    {
        System.out.println("role num: "+rolenum+" name: "+name+" grade: "+grade);
    }
    public int compareTo(Student2 s)
    {
        if(this.rolenum>s.rolenum)
        {
            return 1;
        }
        else if(this.rolenum==s.rolenum)
        {
            return 0;
        }
       else
       {
        return -1;
       }
    }
}
public class TsetColect {
    public static void main(String[] args) {
        Student2 stu=new Student2(81,"sri",'A');
        Student2 stu1=new Student2(82,"drgd",'B');
        Student2 stu2=new Student2(83,"eaf",'C');
        Student2 stu3=new Student2(84,"efwef",'D');
        Student2 stu4=new Student2(85,"ftw",'E');
        TreeSet<Student2> t=new TreeSet<Student2>();
        t.add(stu);
        t.add(stu1);
        t.add(stu2);
        t.add(stu3);
        t.add(stu4);
        for(Student2 i:t)
        {
            i.display();
            System.out.println(" ");
        }
    }
}
