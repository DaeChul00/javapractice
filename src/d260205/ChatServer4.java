package d260205;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//서버에서 notepad명령을 내리면 클라이언트 PC에서 notepad가 열리게 처리
public class ChatServer4 {

	public static void main(String[] args) {
		System.out.println("####서버프로그램 시작####");
		try(ServerSocket server=new ServerSocket(1234)){
			Socket socket=server.accept();
			System.out.println(socket.getRemoteSocketAddress()+"접속");

			BufferedWriter out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			
			//반복을 하면서 챗팅을 주고 받음
			while(true) {
				//서버가 메시지 보내기
				System.out.print("명령 입력:");
				String msg=new Scanner(System.in).nextLine(); //챗팅 뛰워쓰기 가능하므로 nextLine사용
				out.write(msg+"\r\n");
				out.flush();
				Thread.sleep(100);
				
			}
		}catch (Exception e) {
			System.out.println("서버소켓 미생성!!");
			System.exit(0);
		}
		
	}

}