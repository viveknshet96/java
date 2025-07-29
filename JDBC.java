import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        try {
            // Load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Create a connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "mcauser1", "msrit@2024");
            
            // Create statement
            Statement stmt = con.createStatement();
            
            // Execute query
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            
            // Process the result
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }
            
            // Close the connection
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
