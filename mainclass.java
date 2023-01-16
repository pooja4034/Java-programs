class child extends Thread{

 public void run(){
  
 try
 {
   for(int i=5;i>=0;i--)
   {
     System.out.println(this.getName()+" "+i);
     Thread.sleep(500);
   }
 }
 catch(InterruptedException e)
 {
   System.out.println(this.getName()+"Interrupted.");
 }
  System.out.println("Exiting"+this.getName());
}
}
class mainclass{
 
 public static void main(String args[]) throws InterruptedException{
 
  System.out.println("Starting main thread");
  
  child t1 = new child();
  t1.start();
  
  child t2 = new child();
  t2.start();

  Thread.sleep(10000);
  
  System.out.println("Exiting main thread");
}
}
   