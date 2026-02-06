package d260202;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Statement 객체는 완성된 sql에서만 사용
		//완성되지 않은 문장은 PrepeareStatement
		//PreparedStatement -> conn.prepareStatement()
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@172.16.15.89:1521:xe";
		Connection conn=DriverManager.getConnection(url, "system", "1234");
		System.out.println(conn);
		String sql="insert into phonebook values(?,?,?,?)";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, 5);
		ps.setString(2, "김민수");
		ps.setString(3, "010-1234-5678");
		ps.setString(4, "kim@gmail.com");
		int result=ps.executeUpdate(); //Statement객체와 차이점 sql을 여기서 실행
		System.out.println("결과:"+result);
		ps.close();
		conn.close();

	}

}
