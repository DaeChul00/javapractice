package d260130;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@172.16.15.89:1521:xe", "system", "1234");
		
		String sql="insert into phonebook values" + "(1,'신대철','010-1111-1111','hong@gmail.com')";
		Statement stat=conn.createStatement();
		for(int i=2;i<=9;i++) {
			sql="insert into phonebook values ("+i+",'홍길동"+i+"','010-1111-111"+i+"','hong"+i+"@gmail.com')";
			stat.executeUpdate(sql);
		}
		

	}

}
