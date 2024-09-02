class Complex
{
    int real,img;

    Complex()
    {
        System.out.println("welcome");
        real=0;
        img=0;
    }
    Complex(int real)
    {
      this();
      this.real=real;
    }
    Complex(int real,int img)
    {
      this(real);
      this.img=img;
    }
    Complex(Complex s)
    {
      this.real=s.real;
      this.img=s.img;
    }
    static Complex add(Complex a,Complex b)
    {
      Complex c=new Complex();
      c.real=a.real+b.real;
      c.img=a.img+b.img;
      return c;
    }
}
public class Copyconstructor {
   public static void main(String args[])
   {
     Complex obj=new Complex();
     System.out.println(obj.real+obj.img);
     Complex obj1=new Complex(8);
     System.out.println(obj1.real+obj1.img);
     Complex obj2=new Complex(5,6);
     System.out.println(obj2.real+" "+obj2.img);
     Complex obj3=new Complex(obj2);
     System.out.println(obj3.real+" "+obj3.img);
     Complex c5=Complex.add(obj2,obj3);
     System.out.println(c5.real+" "+c5.img);

     } 
}
