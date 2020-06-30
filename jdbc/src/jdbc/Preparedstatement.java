package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Preparedstatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		        Class.forName("com.mysql.cj.jdbc.Driver");
				
				String url = "jdbc:mysql://localhost:3306/course";
				String user = "root";
				String password = "root";
				Connection connection = DriverManager.getConnection(url,user,password);
				String query = "update course set course_fee=?";
				PreparedStatement pstmt = connection.prepareStatement(query);
				pstmt.setString(1,"springs");
				pstmt.setInt(1, 1000);
				int rowsAffected = pstmt.executeUpdate();{
				System.out.println(rowsAffected + " row updated");
				}
				connection.close();
				}
}


