package d260202;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@172.16.15.89:1521:xe";
		Connection conn=DriverManager.getConnection(url, "system", "1234");
		//String sql="select * from phonebook";
		String sql="select id,name,hp,email from phonebook";
		PreparedStatement ps=conn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		System.out.println("___________________________________");
		System.out.println("|아이디  |  이름  |  전화번호  |  이메일  |");
		System.out.println("-----------------------------------");
		while(rs.next()) {
			System.out.print(rs.getInt(1)); //필드명 대신 순서번호 입력가능
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			System.out.println("-----------------------------------");
		}
		System.out.println("____________________________________");
	}

}
