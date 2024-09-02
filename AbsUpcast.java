abstract class Inter{
    abstract void greet();
    abstract int add(int a,int b);
}

public class AbsUpcast extends Inter {
    public static void main(String[] args) {
        Inter i=new AbsUpcast();
        i.greet();
        System.out.println(i.add(4,5));
    }
    void greet()
    {
        System.out.println("gud mrng");
    }
    int add(int a,int b)
    {
        return a+b;
    }
}
