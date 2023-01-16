abstract class staff{
    String name;
    String address;
    staff(String n,String a){
        name=n;
        address=a;
    }
    abstract public void
}
class FullTimestaff extends staff{
    String dpt;
    int salary;
    FullTimestaff(String n,String a,String d,int s){
        super(n,a);
        dpt=d;
        salary=s;
    }
}
class partTimestaff extends staff{
    int noOfHours;
    int ratePerHours;
    partTimestaff(String n,String a,int n1,int r)
    {
        super(n,a);
        noOfHours=n1;
        ratePerHours=r;
    }
}