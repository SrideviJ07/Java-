interface Shape {
    void calculateArea();
}
abstract class Details
{
    abstract void displaydetails();
}

class Circle extends Details implements Shape
{
     
      double r,a;
       public Circle(double r)
       {
        this.r=r;
       } 
      public void calculateArea()
      {
        a=3.16*r*r;
      }
     
      void displaydetails() {
      System.out.println("area of circle: "+a);
      }
   
}
class Rectangle extends Details implements Shape
{
      int length,breadth,a1;
       public Rectangle(int length,int breadth)
       {
        this.length=length;
        this.breadth=breadth;
       } 
      public void calculateArea()
      {
   
         a1=length*breadth;
      }
      void displaydetails() {
        System.out.println("area of circle: "+a1);
        }
}
public class OppShape {
    public static void main(String[] args) {
        Circle cir=new Circle(5);
        cir.calculateArea();
        cir.displaydetails();
        Rectangle rec=new Rectangle(6,5);
        rec.calculateArea();
        rec.displaydetails();


    }
}
