import java.util.*;

 class Larray{
  
   static int Largest(int []a,int n)
   {
     Arrays.sort(a);
     return a[n-1];
   }
 public static void main(String args[])
 {
   int a[]={2,5,9,6,4};
   int n =a.length;

   System.out.println(Largest(a,n));
 }
}