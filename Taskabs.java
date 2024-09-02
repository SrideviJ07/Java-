interface Taskf
{
     void fibo(int n);
}
abstract class Stringrot
{
    abstract boolean rotation(String a,String b);
}
class Fibo1 extends Stringrot implements Taskf 
{
    
   // System.out.println(t1);
    //System.out.println(t2);
    public void fibo(int n)
    {
        int t1=0,t2=1,t3=t1+t2;
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        for(int i=0;i<n;i++)
        {
            
            t1=t2;
            t2=t3;
            t3=t1+t2;
            System.out.println(t3);
        }
     // return 0;
    }
    public boolean rotation(String a,String b)
    {
        if(a.length()!=b.length())
        {
            System.out.println("length is diff no rot");
        }
        a=a.concat(b);
        if(a.indexOf(b)!=-1)
        {
            return true;
        }
        return false;
    }
    
}
public class Taskabs {
    public static void main(String[] args) {

       Fibo1 f=new Fibo1();
       f.fibo(10);
       System.out.println(f.rotation("sridevi","devisri"));
    }
}
