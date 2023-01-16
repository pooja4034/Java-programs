class vehicle{
 
 void run()
 {
   System.out.println("Vehicle is running");
 }
}
class bike extends vehicle{
 
 void run()
 {
   System.out.println("Bike is running safly");
 }
public static void main(String args[])
{
  vehicle obj = new vehicle();
  obj.run();
 
  bike obj1 = new bike();
  obj1.run();
}
}