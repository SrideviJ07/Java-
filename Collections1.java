import java.util.*;
public class Collections1 {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(9);
        a.add(2);
        a.add(3);
        a.add(7);
        a.add(1);
        a.add(6);
        a.add(5);
        for(int i=0;i<a.size();i++)
        {
            System.out.print(a.get(i)+" ");
        }
        Collections.sort(a);
        System.out.println(" ");
        for(int i=0;i<a.size();i++)
        {
            System.out.print(a.get(i)+" ");
        }
        System.out.println(" ");
        
       System.out.println("median: "+a.get((a.size()-1)/2));
       ArrayList<Integer> b=new ArrayList<Integer>();
        b.add(9);
        b.add(2);
        b.add(3);
        b.add(7);
        b.add(1);
        b.add(6);
        b.add(5);
    int temp=b.get(0);
    for(int i=0;i<b.size();i++)
    {
       if(b.get(i)>temp)
       {
        temp=b.get(i);
       }
    }
    System.out.println("maximum num:"+temp);
    int temp1=0;
    for(int i=0;i<b.size();i++)
    {
       if(b.get(i)<temp1)
       {
        temp=b.get(i);
       }
    }
    System.out.println("minimum num:"+temp1);
    int sum=0;
    for(int i=0;i<b.size();i++)
    {
       sum+=b.get(i);
    }
    System.out.println("average: "+(sum/(b.size())));
    
    
}
   
}
