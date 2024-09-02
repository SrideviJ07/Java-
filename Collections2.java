import java.util.*;
class Studentss
{
    String name;
    int id;
    Studentss()
    {
        System.out.println("welcome");
    }
    Studentss(String name,int id)
    {
        this();
       this.name=name;
       this.id=id;
    }
    void display()
    {
        System.out.println("name:"+name);
        System.out.println("id:"+id);
    }
}
public class Collections2 {
    public static void main(String[] args) {
        Studentss s=new Studentss("sri",82);
        Studentss s1=new Studentss("sridevi",83);
        ArrayList <Studentss> a= new ArrayList<Studentss>();
        a.add(s);
        a.add(s1);
       // a.display();
        //a.display();
        for(Studentss i:a)
        {
            i.display();
            System.out.println(" ");
        }

    }
}
