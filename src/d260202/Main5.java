package d260202;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@172.16.15.89:1521:xe";
		Connection conn=DriverManager.getConnection(url, "system", "1234");
		System.out.println(conn);
		String sql="delete from phonebook where id=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, 5);
		int result=ps.executeUpdate();
		System.out.println("결과:"+result);
		ps.close();
		conn.close();

	}

}
