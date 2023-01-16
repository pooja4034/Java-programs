class Employee{
  
  int ID;
  float salary;
}
class Persone extends Employee{

 String Name;
 String Address;

 public static void main(String args[])
 {
   Persone p = new Persone();
    
   p.ID = 1;
   p.salary = 10000;
   p.Name = "XYZ";
   p.Address = "Karad";
 
   System.out.println(p.ID+" "+p.salary+p.Name+" "+p.Address+" ");
 }
}
