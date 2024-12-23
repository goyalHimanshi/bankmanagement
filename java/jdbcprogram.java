import java.sql.*;
import java.util.*;


public class jdbcprogram {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection com=DriverManager.getConnection("jdbc.mysql:///mydb","root","");
            String query="insert into student values('102','nanu',90)";
            PreparedStatement stmt=com.prepareStatement(query);
            stmt.executeUpdate();
            System.out.println("record updated");
        }
        catch(Exception ae){
            System.out.println(ae.getMessage());
        }
    }
}

