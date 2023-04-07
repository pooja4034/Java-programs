import java.util.*;
import java.io.*;

class A implements Runnable{

    int no;
    Thread t;

    A(int no1)
    {
        no=no1;
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
        try{
        for(int i=1;i<=no;i++)
        {
            System.out.println("Hello");
            t.sleep(1000);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class runnablethread
{
    public static void main(String args[])
    {
        A a= new A(5);
    }
}