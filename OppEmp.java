class Employee
{
    private String name;
    private int id,salary;
    String getname()
    {
        return name;
    }
    int getid()
    {
        return id;

    }
    int getsalary()
    {
        return salary;
        
    }
    void setname(String n)
    {
        name=n;
    }
    void setid(int i)
    {
        id=i;

    }
    void setsalary(int s)
    {
        salary=s;

    }
}



public class OppEmp
{
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.setname("sri");
        emp.setid(553);
        emp.setsalary(50000);

        System.out.println(emp.getname());
        System.out.println(emp.getid());
        System.out.println(emp.getsalary());

    }
}