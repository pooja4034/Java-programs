interface A {
    
    void show();
}
interface B{
    void display();
}
class multiple implements A,B
{
    public void show(){
        System.out.println("Message show");
    }
    public void display()
    {
        System.out.println("Message Display");
    }
    public static void main(String args[]){
      multiple mp = new multiple();
      mp.show();
      mp.display();
}
     
}
