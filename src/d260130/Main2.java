package d260130;

import java.sql.*;

public class Main2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@172.16.15.89:1521:xe", "system", "1234");
		//Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1234");
		System.out.println(conn);

		Statement stat=conn.createStatement();
		stat.execute("drop table phonebook");
		String ctable="create table phonebook("
				+ " id int,"
				+ " name varchar2(10),"
				+ " hp varchar2(13),"
				+ " email varchar2(30)"
				+ ")";
		stat.execute(ctable);
				
		String sql="insert into phonebook values(1,'홍길동','010-1111-1111','hong@gmail.com')";
		
		System.out.println(stat.executeUpdate(sql));
		

	}

}
