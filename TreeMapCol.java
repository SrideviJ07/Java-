import java.util.*;
class Author 
{
    String name;
    int year;
    Author(String name,int year)
    {
        this.name=name;
        this.year=year;
    }
    void display()
    {
      System.out.println("value:\n"+name+" "+year);
    }
    
}
class Book implements Comparable<Book>
{
    String name;
    int year;
    Book(String name,int year)
    {
        this.name=name;
        this.year=year;
    }
    void disp()
    {
      System.out.println("key:\n"+name+" "+year);
    }
    public int compareTo(Book a)
    {
        if(this.year>a.year)
        {
            return 1;
        }
        else if(this.year==a.year)
        {
            return 0;
        }
        else
        return -1;
    }

}


public class TreeMapCol {
    public static void main(String[] args) {
        Author a=new Author("maths",2022);
       Author a1=new Author("maths1",20221);
        Book b=new Book("science",1999);
        Book b1=new Book("science1",19919);
        TreeMap<Book,Author> hm=new TreeMap<Book,Author> ();
        hm.put(b,a);
        hm.put(b1,a1);
        for(Book i:hm.keySet()){
            i.disp();
            hm.get(i).display();

        }
        //System.out.println(hm+" ");
    
      }
    
}