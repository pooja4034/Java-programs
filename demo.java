class demo implements Runnable{
 Thread t;
 demo(){
   t=new Thread(this,"child thread");
   t.start();
 }
 public void run()
 { 
   System.out.println("child tread");
   
   try{
    for(int i=1;i<5;i++)
    {
      System.out.println(i);
      Thread.sleep(5000);
    }
   }
   catch(InterruptedException e)
    {
      System.out.println("Exception "+ e);
      System.out.println("Exiting child thread");
    }
 }
}
class Mainthread{
  public static void main(String args[])
  {
    System.out.println("Inside Main");
    demo d = new demo();
   
   try{
      for(int i=0;i<5;i++)
      {
        System.out.println("Main Thread"+ i);
        Thread.sleep(1000);
      }
   }
   catch(InterruptedException e)
      {
        System.out.println("Exception occures");
        
      }
        System.out.println("Exiting main Thread");
  }
}