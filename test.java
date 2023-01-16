class test{
 public static void main(String args[])
 {
   int Number;
   String Name ="abc";
 try
  {
   Number=Integer.parseInt(Name);
  }
  catch(ArithmeticException a)
  {
    System.out.println("Arithmetic exception Occurs:"+a);
  }
  catch(ArrayIndexOutOfBoundsException In)
  {
   System.out.println("Array index exception occurs"+In);
  }
  catch(Exception e)
  {
    System.out.println("Exception occurs:"+e);
  }
 }
}