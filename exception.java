class exception{
 public static void main(String args[])
 {
   int a[] = new int[5];
 try
  {
   a[10]= 20;
  }
  catch(ArithmeticException e)
  {
    System.out.println("Arithmetic exception Occurs");
  }
  catch(ArrayIndexOutOfBoundsException ob)
{
   System.out.println("Array index out of bounds exception");
   a[1]=25;
   System.out.println("Element at index 1 = "+a[1]);
}
 }
}