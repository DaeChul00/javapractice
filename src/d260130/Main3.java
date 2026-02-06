package d260130;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@172.16.15.97:1521:xe", "system", "1234");
		
		String sql="insert into phonebook values" + "(1,'신대철','010-1111-1111','hong@gmail.com')";
		Statement stat=conn.createStatement();
		System.out.println(stat.executeUpdate(sql));
		

	}

}
