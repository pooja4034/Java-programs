import java.util.*;
import java.io.*;

class A extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("from thread a: "+i);
        }
    }
}
class B extends Thread
{
    public void run()
    {
        for(int j=1;j<=10;j++)
        {
           System.out.println("From thread b: "+j);
        }
    }
}
class extendthread{

    public static void main(String args[])
    {
        A a = new A();
        a.start();
        B b = new B();
        b.start();
    }
}