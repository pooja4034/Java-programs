class overload{
 double pi = 3.14;

 void area(int a)
 {
   System.out.println("area of circle:"+pi*a*a);
 }
 void area(int x,int y)
 {
   System.out.println("area of circle:"+x*y);
 }
 void area(int l,int m,int n)
 {
   System.out.println("area of circle:"+l*m*n);
 }
}
class overloadDemo{
 
 public static void main(String args[])
 {
   overload obj = new overload();
   obj.area(11);
   obj.area(11,12);
   obj.area(12,15,18);
}
}