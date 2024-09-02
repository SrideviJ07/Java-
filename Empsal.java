import java.util.*;
class Employee
{
int id;
String name;
int salary; 
void details()
{
    System.out.println(id+" "+name+" "+salary);
}
}
public class Empsal {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Employee emp1=new Employee();
        Employee emp2=new Employee();
        Employee emp3=new Employee();
        emp1.id=sc.nextInt();
        emp2.id=sc.nextInt();
        emp3.id=sc.nextInt();
        emp1.name=sc.next();
        emp2.name=sc.next();
        emp3.name=sc.next();
        emp1.salary=sc.nextInt();
        emp2.salary=sc.nextInt();
        emp3.salary=sc.nextInt();
        Employee emp;
        if((emp1.salary>emp2.salary)&&(emp1.salary>emp3.salary))
        {
            emp=emp1;
        }
        else if(emp2.salary>emp3.salary)
        {
            emp=emp2;
        }
        else
        {
            emp=emp3;
        }
        emp.details();
    }
}

