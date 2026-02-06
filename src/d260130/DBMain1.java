package d260130;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBMain1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//사용할 db의 드라이버를 로드한다.
		//Class.forName(드라이버위치); 드라이버 라이브러리 로드
		
		//접속객체를 이용하여 접속한다.
		
		//접속객체를 이용하여 sql문을 처리할 객체를 만든다. Statement
		
		//sql처리 객체를 이용하여 sql을 실행한다
		
		Class.forName("org.h2.Driver");
		//Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
		Connection conn=DriverManager.getConnection("jdbc:h2:tcp://172.16.15.97:8082/~/test", "sa", "");
		System.out.println(conn);
		if(conn==null) {
			System.out.println("연결 실패!");
			return;
		}
		System.out.println("시험 성공");

		Statement stat=conn.createStatement();
		String sql="insert into phonebook values(1,'홍길동','010-1111-1111','hong@gmail.com')";
		
		int result=stat.executeUpdate(sql);
		if(result<0) System.out.println("입력 실패!!");
		System.out.println("입력성공!");
		
	}

}
