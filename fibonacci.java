import java.util.Scanner;
class fibonacci {
 
    public static void main(String args[])
    {
          int num,i;
        Scanner sc = new Scanner(System.in);

          System.out.println("Enter the term:");
          num=sc.nextInt();
     
          System.out.println("Fibonacci series of first "+num+" terms is");
          for(i=0;i<num;i++)
          {
              System.out.print(fibo(i)+" ");
          }
    }
 
    static int fibo(int no)
    {
          if (no==0)
              return 0;
          else if (no==1)
                return 1;
          else
              return (fibo(no-1)+fibo(no-2));
    }
}
