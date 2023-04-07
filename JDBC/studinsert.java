import java.util.*;
import java.sql.*;

class studinsert{

    public static void main(String args[])
    {
        Connection con=null;
        Statement st;
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fymca","root","admin");
            if(con!=null)
            {
                System.out.println("Connection Established");
            }
            st=con.createStatement();
            st.executeUpdate("insert into student values(1,'pooja','peth')");
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}