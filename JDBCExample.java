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
            

		//INSERT
	    String insertSQL ="INSERT INTO student(id,name) VALUES(9,'nithin')";
	    int rowsInserted = stmt.executeUpdate(insertSQL);
	    System.out.println("Rows Inserted: "+rowsInserted);
	    ResultSet rs = stmt.executeQuery("SELECT * FROM student");
	    System.out.println("Current student table data:");
 	    while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }

	   //UPDATE
	   String updateSQL="UPDATE student SET name='Ram' WHERE id=1";
	   int rowsUpdated =stmt.executeUpdate(updateSQL);
  	   System.out.println("Rows updated:" + rowsUpdated);
	   

	   //DELETE opertion
	   String deleteSQL="DELETE FROM student WHERE id=8";
	   int rowsDeleted =stmt.executeUpdate(deleteSQL);
  	   System.out.println("Rows deleted:" + rowsDeleted);


            // Execute query
            ResultSet rs1 = stmt.executeQuery("SELECT * FROM student");
            
            // Process the result
            while (rs1.next()) {
                System.out.println(rs1.getInt(1) + " " + rs1.getString(2));
            }
            
            // Close the connection
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
