import java.io.*;
import java.util.*;
import java.util.Scanner;
class menuedriven{
    static Scanner sc = new Scanner(System.in);

    static int OrderList[] = new int[5];
    static int i = -1;
    static int Total = 0;
    static int Cnt= 0;
    static void GetOrder(){
        Cnt++;
        System.out.println("Welcome To The Restaurant");
        System.out.println("Please Choose your Food");
        System.out.print("ENter code:");
        int OrderChoice = sc.nextInt();
        if(OrderChoice >= 1 && OrderChoice <= 4){
            i+=1;
            OrderList[i] = OrderChoice;
            System.out.print("\nAnything else..? \nif Yes Press 'y' if No press 'n' \n\n ");

            char Extra = sc.next().charAt(0);
            if(Extra == 'y' || Extra == 'Y')
            { 
                GetOrder();
            }else{
                Bill();
            }
        }
    }
    static void Bill(){
        System.out.println("Your Bill");
        for(int i=0; i<Cnt; i++){
            switch(OrderList[i]){
                case 1 :
                    System.out.println("Burger \t\t : 100 ");
                    Total = Total + 100;
                    break;
                case 2 : 
                    System.out.println("Pizza \t\t : 400 ");
                    Total = Total + 400;
                    break;
                case 3 :
                     System.out.println("Sandwitch \t : 200 ");
                    Total = Total + 200;
                    break;
                case 4 :
                     System.out.println("Coffee \t : 50 ");
                    Total = Total + 50;
                    break;
            }
        }
        System.out.print("Total: " + Total);
    }
    public static void main(String args[]){
        GetOrder();
    }
}
