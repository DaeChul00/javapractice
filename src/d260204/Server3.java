package d260204;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server3 {
	//서버 프로그램 중지...
	//서버를 중지하면 클라리언트 프로그램도
	//동시에 중지되는 형상을 막아야

	public static void main(String[] args) {
		// 서버 소켓을 만들고 소켓으로 들어오는 것을 감지하면 accept하여 새로운 소켓이 생성된다.
		try {
			System.out.println("서버프로그램 시작");
			ServerSocket server = new ServerSocket(5555);
			Socket socket = server.accept();
			System.out.println("클라이언트가 서버에 접속했습니다.!!");
			//서버는 데이터를 제공하는 역할만 처리 (outputStream만 존재하면 됨)
			OutputStream out=socket.getOutputStream();
			while(true) {
				out.write('a');
				Thread.sleep(3000);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
