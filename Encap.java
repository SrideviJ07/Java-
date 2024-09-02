class Secure
{
    private String name;
    private int id;
    
    Secure(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
    public String getname()
    {
        return name;
    }
    public int getid()
    {
        return id;
    }
}
public class Encap {
    public static void main(String[] args) {
       // System.out.println("enter the value:");
        //Scanner sc=new Scanner();
        //int n=sc.nextInt();
        Secure s[]=new Secure[5];
        //s.setname("sri",55);
        //System.out.println(s.getname()+" "+s.getid());
       s[0]=new  Secure("sridevi",55);
       s[1]=new  Secure("sridevi",55);
       s[2]=new  Secure("sridevi",55);
       s[3]=new  Secure("sridevi",55);
       s[4]=new  Secure("sridevi",55);
        
       for(Secure s1:s)
       {
        System.out.println(s1.getname()+" "+s1.getid());
       }



    }
}
