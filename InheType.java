class Vehicle
{
    int fuelcapacity,speed;
    
    public Vehicle(int fuelcapacity,int speed)
    {
        this.fuelcapacity=fuelcapacity;
        this.speed=speed;
    }
    public int fdetails()
    {
     return fuelcapacity;

    }
    public int sdetails()
    {
     return speed;
     
    }
}
class Car extends Vehicle
{
    String brand;
    public Car(int fuelcapacity,int speed,String brand)
    {
        super(fuelcapacity,speed);
        this.brand=brand;
       
    }
    public String bdetails()
    {
     return brand;
     
    }
}
class Bike extends Vehicle
{
    String typename;
    public Bike(int fuelcapacity,int speed,String typename)
    {
        super(fuelcapacity,speed);
        this.typename=typename;
       
    }
    public String tdetails()
    {
      return typename;
     
    }
}
public class InheType
{
    public static void main(String args[])
    {
        Car c=new Car(88,55,"tata");
        Bike b=new Bike(22,55,"splender");
        System.out.println("-------car--------");
        System.out.println("fuel_capacity: "+c.fdetails());
        System.out.println("speed: "+c.sdetails());
        System.out.println("brand name: "+c.bdetails());
        System.out.println("-------bike--------");
        System.out.println("fuel_capacity: "+b.fdetails());
        System.out.println("speed: "+b.sdetails());
        System.out.println("brand name: "+b.tdetails());
        
    }
}
