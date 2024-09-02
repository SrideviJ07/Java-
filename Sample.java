import java.util.*;
class Employee
{
    int id;
    String name;
    static String companyname="abc";
    void print()
    {
        System.out.println(id+"\n"+name+"\n"+companyname+"\n");
    }
}


public class Sample{
    public static void main(String args[])
{
        Employee emp=new Employee();
        emp.id=5;
        emp.name="sri";
        System.out.println(emp.id);
        System.out.println(emp.name);
        
    }
}