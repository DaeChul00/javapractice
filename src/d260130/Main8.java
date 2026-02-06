package d260130;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main8 {

	public static void main(String[] args){
		Connection conn=null;
		String url=null;
		String username=null;
		char[] password= {};
		int cnt=0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 확인하세요.!!");
			return;
		}
		do{
		System.out.print("username:");
		username=(new Scanner(System.in)).next();
		System.out.print("password:");
		password=System.console().readPassword();
		url="jdbc:oracle:thin:@172.16.15.89:1521:xe";
		try {
			conn=DriverManager.getConnection(url, username, new String(password));
		} catch (SQLException e) {
			System.out.println("아이디 또는 패스위드를 확인하세요.");
		}
		cnt++;
		if(conn!=null) break;
		}while(conn==null && cnt<3);
		if(conn==null) {
			System.out.println("다시 실행하여 실행하여 주시기 바랍니다.");
			System.exit(0);
		}
		System.out.println("SQL>");
	}

}
