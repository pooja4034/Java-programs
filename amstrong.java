import java.util.*;
import java.io.*;
 
 class demo{
    
    int num,orgnum,rem,result=0;

    Scanner sc = new Scanner(System.in);

    void get()
    {
        System.out.println("Enter number:");
        num=sc.nextInt();

    }
    void amst()
    {
       orgnum=num; 
       while(orgnum != 0)
       {
        rem= orgnum%10;
        result += Math.pow(rem,3);
        orgnum /= 10;
       }
       if(result==num)
       {
         System.out.println("Amstrong:"+num);
       }
       else{
         System.out.println("Is not Amstrong:"+num);
       }
    }
 }
 class amstrong{
    public static void main(String args[])
    {
        demo obj = new demo();
        obj.get();
        obj.amst();

    }
 }
