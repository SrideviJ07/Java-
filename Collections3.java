import java.util.*;
class Studentss1
{
    String name;
    int id;
    Studentss1()
    {
        System.out.println("welcome");
    }
    Studentss1(String name,int id)
    {
        this();
       this.name=name;
       this.id=id;
    }
    void display()
    {
        System.out.println("\nname:"+name);
        System.out.println("id:"+id);
    }
}
public class Collections3 {
    public static void main(String[] args) {
        Studentss1 s=new Studentss1("dhanush",19);
        Studentss1 s1=new Studentss1("sridevi",82);
        Set <Studentss1> sh= new HashSet<Studentss1>();

       sh.add(s);
       sh.add(s1);

       for(Studentss1 g:sh)
       {
        g.display();
        System.out.println(" ");
       }


    }

    }
