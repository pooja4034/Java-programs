import java.util.Scanner;
public class DeepCloaning implements Cloneable {


public Object clone() throws CloneNotSupportedException
{
return (DeepCloaning)super.clone();
}

   
    public static void main(String[] args) throws CloneNotSupportedException
    {
       
        DeepCloaning t1 = new DeepCloaning();

    DeepCloaning t2 = (DeepCloaning)t1.clone();

       
        System.out.println(t1 == t2);
    }
}
