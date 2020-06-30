package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Course {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE VALUES");
		Class.forName("com.mysql.cj.jdbc.Driver");  
		
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/course", "root","root"); 
	    String course_id = sc.nextLine();
		int course_fee = sc.nextInt();
		
		Statement stmt=con.createStatement();
	    int rs=stmt.executeUpdate("insert into course values('"+course_id+"','"+course_fee+"')"); 
	    int rs1=stmt.executeUpdate("insert into course values('"+course_id+"','"+course_fee+"')"); 
	    System.out.println(rs1);
	    
	}
		
	}


