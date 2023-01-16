class BCA{
 public static void main(String args[])
 {
   int Result;
 try
  {
   Result= 10/0;
   System.out.println("Division="+Result);
  }
  catch(ArithmeticException e)
  {
    
    Result = 10/1;
    System.out.println("Division : "+Result);
  }
 }
}