class employee{
 
 int id;
 String name;
 int salary;
 
 employee(int i,String n,int s){
  id = i;
  name = n;
  salary = s;
 }
 
 void display()
 {
   System.out.println(id+""+name+""+salary);
 }
 public static void main(String args[])
 {
  employee e1 = new employee(11,"Pooja",20000);
  employee e2 = new employee(22,"Varsha",45000);
  e1.display();
  e2.display();
 }
}