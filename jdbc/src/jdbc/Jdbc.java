package jdbc;
import java.sql.*;

public class Jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");  
		String url="jdbc:mysql://localhost:3306/account";
	    String user= "root";
	    String password ="root";
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/account", "root","root");
	    Statement stmt=con.createStatement();  
	    ResultSet rs=stmt.executeQuery("select * from customer_account_details"); 
	    while(rs.next())  {
		System.out.println(rs.getString("cust_last_name"));
	 }
	    con.close(); 
	}
}
