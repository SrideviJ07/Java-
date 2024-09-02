class Address
{
    int dno;
    String street,city;
    Address(int dno,String street,String city)
    {
        this.dno=dno;
        this.street=street;
        this.city=city;
    }
    /*void display()
    {
        System.out.println(dno+street+city);
    }*/


}
class Student
{
    float cgpa,avg;
    String name;
    Address address;
    Student(Address address)
    {
        this.address=address;
    }
    void display(Address address)
    {   
        System.out.println(address.dno+address.street+address.city);
    }
    void display(float cgpa,float avg)
    {
        System.out.println(cgpa+" "+avg);
    }
}

public class PolyAgreeTask {
    public static void main(String[] args) {
        Address a=new Address(5,"nehru street","chennai");
        Student s1=new Student(a);
        s1.display(a);
        s1.display(22,55);


        

    }
}
