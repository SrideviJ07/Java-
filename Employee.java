import java.util.*;
public class Employee {
    int salary;
    String n1,n2,s1,s2;
void large(int a,int b,int c)
{
    if((a>b)&&(a>c))
    {
        System.out.println("a is greater");
    }
    else if(b>c)
    {
        System.out.println("b is greater");
    }
    else
    {
        System.out.println("c is greater");
    }
 //   return 0;
}
String name()
{
  n1="sri";
  n2="devi"; 
  return (n1+n2);
}
void name1()
{
    s1="devi";
    System.out.println(s1);
}

    public static void main(String args[])
{
Employee emp=new Employee();
Scanner sc=new Scanner(System.in);
System.out.println("enter the value:");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
emp.large(a,b,c);
System.out.println(emp.name());
emp.name1();
}

}

