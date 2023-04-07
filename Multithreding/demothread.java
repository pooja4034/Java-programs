import java.util.*;

class threadEx implements Runnable
{
    Thread t;
    int no;

    threadEx(int n)
    {
        no=n;
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
       try{
 
        for(int i=0;i<=no;i++)
        {
            System.out.println("Hello");
            t.sleep(2000);
        }

       }
       catch(Exception e){}
    }
}
class demothread
{
    public static void main(String args[])
    {
        threadEx ob = new threadEx(50);
    }
}