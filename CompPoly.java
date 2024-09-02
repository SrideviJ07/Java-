class Teacher 
{
   void teach(String sub1,String sub2)
    {
     System.out.println("teacher teaches "+sub1+" and "+sub2);
    }
    float study(float a)
    {
       return a+2;
    }
}
class Student extends Teacher
{
     void teach(String sub1,String sub2)
    {
    
     System.out.println("student teaches "+sub1+" and "+sub2);
    }
    float study(float a)
    {
       return super.study(a);
    }

    
}
public class CompPoly {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.teach("maths","english");
        Teacher t1=new Teacher();
        t1.teach("maths","english");
        System.out.println("how many teacher teaches:"+s1.study(55));
        System.out.println("how many teacher teaches:"+s1.study(5.5f));////just 5.5 means double so put f

    }
}
