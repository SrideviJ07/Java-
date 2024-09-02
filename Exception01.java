class SizeOverException extends Exception
{
  SizeOverException(String s)
  {
    super(s);
  }
}
class r {
   static void check(int age)
   {
    if(age<18)
    {
        throw new ArithmeticException("the age is below 18");
    }
   }
}
/*class s
{
    void get()
    {
        System.out.println("heloo s");
         try{
                int n=10/0;
            }
            catch(ArithmeticException a){
              System.out.println("enter crt num "+a);
            }
    }
    
}
class s2 extends s
{
    void get()
    {
        System.out.println("heloo s2");
        try{
            int n=10/0;
        }
        catch(ArithmeticException a){
          System.out.println("enter crt num "+a);
        }
}
    }*/
    

public class Exception01 {
    public static void main(String[] args) {
        System.out.println("welcomes you");
        try{
            try{
                int n=10/0;
            }
            catch(ArithmeticException a){
              System.out.println("enter crt num "+a);
            }
        }
        catch(Exception e)
            {
            System.out.println("handled"+e);
        }
       try
       {
         int a=9*2;
       }
       catch(Exception e)
       {
        System.out.println("occured "+e);
       }
       finally{
        System.out.println("code is terminated");
       }
       try{
         r.check(13);
       }
       catch(ArithmeticException e){
        System.out.println(e);
       }




       //SizeOverException soe =new SizeOverException("handled");
       try{
         throw new SizeOverException("size over");
       }
       catch(SizeOverException e1)
       {
        System.out.println(e1);
       }
    }
    
}
