 class Heirarchical {
    
 void methodHerirarchical()
 {
   System.out.println("Method of class Heirarchical");
 }

}
class A extends Heirarchical
{
    void methodA()
 {
   System.out.println("Method of class A");
 }

}
class B extends Heirarchical
{
    void methodB()
 {
   System.out.println("Method of class B");
 } 
}
class C extends Heirarchical
{
    void methodC()
 {
   System.out.println("Method of class C");
 }
}
class HrDemo{

    public static void main(String args[])
    {
        A child1 = new A();
        B child2 = new B();
        C child3 = new C();
        
        child1.methodA();
        child2.methodB();
        child3.methodC();
    }
}
