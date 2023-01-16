import java.util.*;
 class array1{
  
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int a[] = new int[4];
   
    for(int i=0;i<a.length;i++)
    {
      System.out.println("print element: ");
      a[i]=sc.nextInt();
    }
    
    for(int i:a)
   {
     System.out.println(i);
   }
     
 }
}