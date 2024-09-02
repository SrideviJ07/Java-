class Student
{
    String name;
    int mark;
    public Student()
    {
        System.out.println("welcome to grade system");
    }
    public Student(String name,int mark)
    {
        this.name=name;
        this.mark=mark;
    }
    public char calculatemarks()
    {
        if(mark>90)
    {
        return 'A';}
        else if(mark>80)
        {
        return 'B';
        }
        else if(mark>70)
        {
        return 'C';
        }
        else if(mark>60)
        {
        return 'D';
        }
        else if(mark>50)
        {
        return 'E';
        }
        return 'f';
    }
    String displayname()
    {
        return name;
    }
    int displaymark()

    {
        return mark;
    }
}
 public class MarkManage {
    public static void main(String[] args) {
        Student s1=new Student("sri",85);
        System.out.println("name: "+s1.displayname());
        System.out.println("mark: "+s1.displaymark());
        System.out.println("grade: "+s1.calculatemarks());
        Student s2=new Student("lakshmi",99);
        System.out.println("name: "+s2.displayname());
        System.out.println("mark: "+s2.displaymark());
        System.out.println("grade: "+s2.calculatemarks());
        
    }
}
