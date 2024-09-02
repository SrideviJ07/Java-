interface Mathe
{
    boolean prime(int num);
    int fact(int n);
    
}
class Mat implements Mathe
{
    public boolean prime(int num)
    {
        if(num==1||num==0)
        {
            return false;
        }
        for(int i=2;i<num/2;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public int fact(int n)
    {
       int f=1;
       for(int i=1;i<=n;i++)
       {
        f=f*i;
       } 
       return f;
    }
    void display()
    {
        System.out.println(prime(5));
        System.out.println(fact(5));
    }
}

public class Abstract {
    public static void main(String[] args) {
        Mat m=new Mat();
        m.display();
    }
    
}
