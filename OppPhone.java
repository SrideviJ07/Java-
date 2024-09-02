import java.util.*;
interface Android
{
    void AvirtualAssitant();

}
interface Iphone
{
    void IvirtualAssitant();
}
class A implements Android{
    public void AvirtualAssitant()
    {
      System.out.println("Android virtual Assistant is google assistant");
    }

}
class I implements Iphone{
    public void IvirtualAssitant()
    {
      System.out.println("Iphone virtual Assistant is siri");
    }

}
class Hybrid implements Android,Iphone
{
    public void AvirtualAssitant()
    {
      System.out.println("hybrid virtual Assistant is google assistant");
    }
    public void IvirtualAssitant()
    {
      System.out.println("hybrid virtual Assistant is siri");
    }
}
public class OppPhone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("");
        System.out.println("Choose the choice from below options");
        System.out.println("1.Android features");
        System.out.println("2.Iphone features");
        System.out.println("3.Hybrid phone features");
        int choice=sc.nextInt();
        switch(choice)
        {
          case 1:
                 A an=new A();
                 an.AvirtualAssitant();
                 break;
          case 2:
                 I ip=new I();
               ip.IvirtualAssitant();
               break;
          case 3:
                Hybrid h=new Hybrid();
                h.AvirtualAssitant();
                h.IvirtualAssitant();
                break;
         default:
               System.out.println("enter the valid number:");
         }
    }
}
