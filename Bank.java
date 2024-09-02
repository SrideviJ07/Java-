import java.util.*;
class Banker
{
    int tot=70000,credit,debit;
    void credit1(int c)
    {
        if(c<0)
        {
           System.out.println("enter amount is negative");
        }
       else if(c>0)
       {
        tot=tot+c;
        if(tot>100000)
        {
            System.out.println("your amount is greater than 1 lakh");
        }
       else
       {
        System.out.println(tot);
       }
        
       }
    }
    void debit1(int d)
    {
        if(d<0)
       {
        System.out.println("enter amount is negative");
       }
       else if(tot<d)
       {
        System.out.println("Insufficient balance");
       }
       else
       {
        tot=tot-d;
        System.out.println(tot);
       }
    }
    
    }


public class Bank {
    //Banker b=new Banker();
    public static void main(String args[])
    {
    Banker b=new Banker();
    Scanner sc=new Scanner(System.in);
    System.out.println("1.credit 2.debit 3.check balance 4.exit");
    while(true)
    {
        int n=sc.nextInt();
    switch (n) {
        case 1:
            b.credit=sc.nextInt();
            b.credit1(b.credit);
            break;
        case 2:
            b.debit=sc.nextInt();
            b.debit1(b.debit);
            break;
        case 3:  
            System.out.println(b.tot);
            break;
        case 4:  
            System.exit(0);
            break;
        default:
            break;
      }
     }
   

    }
   
}
