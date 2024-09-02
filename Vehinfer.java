class Vehicle
{
    String brand="honda";
    int total_branch=100;
    String ceo="sri";

}
class Bike extends Vehicle
{
  int bikenum=9652;
  String model="splender";
  String color="black";
  int price=80000;
}
class Scooty extends Vehicle
{
    int scnum=1234;
    String model="dio";
  String color="red";
  int price=90000;
    
}
class Car extends Vehicle
{
    int carnum=7777;
    String model="Honda amaze";
  String color="maroon";
  int price=500000;

}
public class Vehinfer {
    public static void main(String args[])
    {
       Bike b=new Bike();
       Scooty s=new Scooty();
       Car c=new Car();
       System.out.println("\n bike \nbrand name: "+b.brand+"\ntotal branches: "+b.total_branch+"\nceo: "+b.ceo+"\nbikenum: "+b.bikenum+"\nmodel: "+b.model+"\ncolor: "+b.color+"\nprize: "+b.price);
       System.out.println("\n scooty \nbrand name: "+s.brand+"\ntotal branches: "+s.total_branch+"\nceo: "+s.ceo+"\nscootynum: "+s.scnum+"\nmodel: "+s.model+"\ncolor: "+s.color+"\nprize: "+s.price);
       System.out.println("\n car \nbrand name: "+c.brand+"\ntotal branches: "+c.total_branch+"\nceo: "+c.ceo+"\nscootynum: "+c.carnum+"\nmodel: "+c.model+"\ncolor: "+c.color+"\nprize: "+c.price);
    }
}
