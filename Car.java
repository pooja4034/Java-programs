public class Car {
    void car()
    {
        System.out.println("Class Car");
    }
    void type()
    {
        System.out.println("Vechicale type");
    }
}
class maruti extends Car{
    void maruti()
    {
        System.out.println("Class maruti");
    }
    void brand()
    {
        System.out.print("Maruti model:1800");
    }
    
}
class maruti1800 extends maruti
{ 
    void maruti1800()
    {
        System.out.print("Model 1800");
    }
    void speed()
    {
        System.out.print("MaxL:80kmph");
    }
   
     public static void main(String args[])
    {
        maruti1800 mr = new maruti1800();
        mr.brand();
        mr.speed();
        mr.type();
    }
}
