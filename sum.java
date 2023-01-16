public class sum{

   static int sum(int n)
   {
    int sum = 0;

    for(int i = 1;i<=n;i++)
     
       sum = sum + i;
       return sum;
  }
     
 public static void main(String args[])
 {

   int n = 10;
   System.out.println("Sum of numbers is:"+sum(n));
 }

}
