class Author{
    String aname;
    int aage;
    String city;
    Author()
    {
        System.out.println("thanks author");
    }
    Author(String aname,int aage,String city)
    {
        this.aname=aname;
        this.aage=aage;
        this.city=city;
    }
    void print()
    {
        System.out.println("author name:"+aname);
        System.out.println("author age:"+aage);
        System.out.println("author city:"+city);

    }

}
class Book
{
    String bookname;
    int pyear;
    Author author;
    Book()
    {
        System.out.println("thanks book");
    }
    Book(String bookname,int pyear,Author author)
    {
        this.bookname=bookname;
        this.pyear=pyear;
        this.author=author;
    }
    void print()
    {
        System.out.println("book name:"+bookname);
        System.out.println("book age:"+pyear);
        //System.out.println("author city:"+author);
        author.print();
    }
}
public class Agree {
    public static void main(String[] args) {
        Author a=new Author("shakespere",55,"turkey");
        Book b=new Book("nightmare",1991,a);
        a.print();
        //System.out.println("bookname:"+b.bookname);
        //System.out.println("published year:"+b.pyear);
        b.print();
        
        
    }
}
