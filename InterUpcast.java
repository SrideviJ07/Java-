interface In001{
    void greet();
    int mul2(int a);
}
public class InterUpcast implements In001 {
    public static void main(String[] args) {
        In001 i=new InterUpcast();
        i.greet();
        System.out.println(i.mul2(4));
    }
    public int mul2(int a)
    {
        return a*2;
    }
    public void greet()
    {
        System.out.println("welcome");
    }
}
