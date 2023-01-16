import java.util.*;
import java.io.*;

class prime{

   
     void prime()
     {
        int num,i,count=0;
    Scanner sc = new Scanner(System.in);

     System.out.println("Enter a Number: ");
     num = sc.nextInt();

      for(i=2; i<num; i++)
      {
         if(num%i == 0)
         {
            count++;
            break;
         }
      } 
      if(count==0)
      {
          System.out.println("prime");
      }
      else
      {
           System.out.println("not prime");
      }
     }
}
class Ex{

    public static void main(String args[]){

    prime obj = new prime();

    obj.prime();
    }

}