package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcProducts {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/product";
		String user="root";
		String password="root";
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st= con.createStatement();
		String str = "select*from product";
		ResultSet rs = st.executeQuery(str);
		while(rs.next()) {
			System.out.println(rs.getString("prod_name"));
	}		
		con.close();

}
}