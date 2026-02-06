package d260204;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyWebServer5 {

	public static void main(String[] args) {
		try(ServerSocket server=new ServerSocket(8888)){
			System.out.println("서버프로그램 실행중......");
			
			while(true) {
			Socket socket=server.accept();
			System.out.println("접속한 ip:"+socket.getRemoteSocketAddress());
			BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String line=null;
			try {
				while((line=br.readLine())!=null) {
					if(line.startsWith("GET")) {
						String url=line.split(" ")[1];
						System.out.println(url);
						String path=url.split("?")[0];
						System.out.println(path.substring(1));
						String query=url.split("?")[1];
						System.out.println(query);
					}
					if(line.isEmpty()) {
						break;
					}
					System.out.println(line);
				}
			}catch(Exception e) {System.out.println("읽다가 오류!!");}
			
			//response는 outputstream을 통해 정보를 전달
			String body="접속성공!!";
			String header=""
					+ "HTTP/1.1 200 OK\r\n"
                    + "Content-Type: text/html;charset=utf-8\r\n"
                    + "Content-Length: " + body.getBytes().length + "\r\n"
                    + "\r\n";
			
			socket.getOutputStream().write(header.getBytes());
			socket.getOutputStream().write(body.getBytes());
			socket.close();
			}
			
		}catch(Exception e) {
			
		}
	}

}
