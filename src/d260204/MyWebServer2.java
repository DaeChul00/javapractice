package d260204;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyWebServer2 {

	public static void main(String[] args) {
		
		String html="HTTP/1.1 200 OK\r\n";
		html+="content-type:application/json\r\n";
		html+="Connection:close\r\n";
		html+="\r\n"; //http 프로토콜에서 헤드와 바디를 구분하는 빈줄
		html+="{\"result\":\"success\"}";
		html+="\r\n\r\n";
		ServerSocket server=null;
		InputStream in=null;
		OutputStream out=null;
		
		System.out.println("웹서버프로그램!!");
		while(true) {
			try {
				server=new ServerSocket(8888);
				Socket socket=server.accept();
				System.out.println("접속!");
				in=socket.getInputStream();
				out=socket.getOutputStream();
				out.write(html.getBytes());
				Thread.sleep(1000);
				socket.close();
			}catch(Exception e) {}
		}
	}

}
