class Rest
{
    int id,count=0,i;
    String str;
  Rest()
    {
      System.out.println("Welcome to the college");
    }
    Rest(int id)
    {
        this();
        this.id=id;
    }
    Rest(int id,String str)
    {
        this();
        this.id=id;
        this.str=str;
        System.out.println("idnum: "+id+" name: "+str);
    } 
    Rest(int ...j)
    {
        for(int i:j)
     count=(count<i)?i:count;
     System.out.println(count);
    }

}
public class Constructor {
    public static void main(String args[])
    {
        Rest obj=new Rest();
        //System.out.println(obj.a);
        Rest obj1=new Rest(55);
        System.out.println(obj1.id);
        Rest obj2=new Rest(555,"sri");
        Rest obj3=new Rest(1,2,3,4,5);

    }
}
