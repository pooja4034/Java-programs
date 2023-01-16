class Mainthread{
 public static void main(String args[])
 {
   Thread t= Thread.currentThread();
   System.out.println(t);
   
   t.setName("demo Thread");
   System.out.println("Name= "+ t.getName());
   System.out.println("State of Thread "+ t.getState());
   System.out.println("priority "+ t.getPriority());
}
}
   