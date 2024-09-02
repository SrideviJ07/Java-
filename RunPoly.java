class Maths{
    float avg(float a,float b)
    {
        return (a+b);
    }
}
class Maths1 extends Maths
{
    float avg(float a,float b)
    {
        return (a+b)/2;
    }
}

public class RunPoly {
    public static void main(String[] args) {
        Maths m=new Maths();
       // Maths1 m1=new Maths1();
        m=new Maths1();
        System.out.println("m1 maths1(sub class values using parent cls):"+m.avg(5,5));
    }
}
