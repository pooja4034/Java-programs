import java.util.*;
import java.sql.*;

class prepstminsert{

    public static void main(String args[])
    {
        PreparedStatement ps;
        Connection con=null;

        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cust","root","admin");
            if(con!=null)
            {
                System.out.println("Connection Established");
            }
            Scanner sc = new Scanner(System.in);
            String query="insert into customer values(?,?,?,?)";
            ps=con.prepareStatement(query);

            System.out.println("Customer Details");
            System.out.println("Enter Id: ");

            int cid=sc.nextInt();

            System.out.println("Enter Name: ");
            String cname=sc.next();

            System.out.println("Enter Address");
            String cadd=sc.next();

            System.out.println("Enter phn");
            int cphn=sc.nextInt();

            ps.setInt(1,cid);
            ps.setString(2,cname);
            ps.setString(3,cadd);
            ps.setInt(4,cphn);

            int no = ps.executeUpdate();

            if(no!=0)
            {
                System.out.println("Data inserted sucessfully");
            }
            else
            {
                System.out.println("Do not insert");
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}