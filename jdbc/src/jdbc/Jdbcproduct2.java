package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbcproduct2 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product" ,"root" ,"root");
		System.out.println("enter the values");
		float prod_code = sc.nextFloat();
		Statement st = con.createStatement();
		String query = "update course set prod_id=?";
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1, 101);
		System.out.println(pstmt);
	}
    
}
