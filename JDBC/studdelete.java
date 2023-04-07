import java.util.*;
import java.sql.*;

class studdelete{
     public static void main(String args[])
    {
        Connection con=null;
        Statement st;
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","admin");
            if(con!=null)
            {
                System.out.println("Connection Established");
            }
            st=con.createStatement();
         int no= st.executeUpdate("delete from student where name like'v%'");
            if(no!=0)
            {
                System.out.println("data deleted");
            }
            else
            {
                 System.out.println("data not deleted");
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}