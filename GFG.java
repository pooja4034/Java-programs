//Q.3) Write a appropriate java program using method(passing class object to the method).

//Java program to demonstrate that we can swap to 

//Objects be swapping members

//class 1

//Number class car

class car
{
  //Attribute associated with car
   int no;
   car(int no){this.no = no;}
}

//class 2
 
//Uses car objects

class GFG
{
   //Method 1
   //To swap
  
   public static void swap(car c1,car c2)
   {
      int temp = c1.no;
      c1.no=c2.no;
      c2.no=temp;
    }

    //Method 2
    //Main driver method

    public static void main(String args[])
    {
      //Creating car class objects(creating cars)
      
       car c1 = new car(1);
       car c2 = new car(2);

      //Calling method 1
        
        swap(c1,c2);

      //Print and display commands

        System.out.println("c1.no ="+c1.no);
        System.out.println("c2.no="+c2.no);
     }
}