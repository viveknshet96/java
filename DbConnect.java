import java.sql.*;

public class DbConnect
{
  public static void main(String args[])
  {
try
{
     //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/consumer","root","Toor@2024");
     System.out.println("Connected");
     Statement st = conn.createStatement();
     ResultSet rs = st.executeQuery("select * from consumer");
     while(rs.next())
     {
     System.out.println("C_ID="+rs.getString(1)+"Address ="+rs.getString(2));
      }
  }

catch(SQLException s)
{
     System.out.println("Hello");
}
}
}