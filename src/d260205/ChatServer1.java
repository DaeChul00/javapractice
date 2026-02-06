package d260205;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//챗팅(1:1)-무전기형식
//서버와 클라이언트간에 동작할 순서를 정해야한다.
//클라리언트가 서버에 접속을 하고 서버가 먼저 말을 걸지, 아니면 클라이언트가 말을 걸지 정해야 한다.
//클라이언트 접속-(서버가 클라이언트에게 메시지-클라이언트가 서버에게 메시지) 반복
public class ChatServer1 {

	public static void main(String[] args) {
		System.out.println("####서버프로그램 시작####");
		try(ServerSocket server=new ServerSocket(1234)){
			Socket socket=server.accept();
			System.out.println(socket.getRemoteSocketAddress()+"접속");
			System.out.println("챗팅시작!!");
			//반복을 하면서 챗팅을 주고 받음
			InputStream in=socket.getInputStream();
			OutputStream out=socket.getOutputStream();
			while(true) {
				//서버가 메시지 보내기
				System.out.print("보낼 메시지 입력:");
				String msg=new Scanner(System.in).nextLine();
				out.write(msg.getBytes());
				//수신된 메시지 확인하기
				System.out.print("수신메시지");
				while(true) {
					//데이터를 읽기 위해 무한반복을 사용할 경우
					//반복문안에 반드시 if를 이용하여 반복문을 빠져나가기 위한 코드를 작성
					byte[] byterecv=new byte[256];
					int i=0;
					while(in.available()>0) {
						byterecv[i++]=(byte) in.read();
					}
					if(i>0) {
						System.out.println(new String(byterecv).trim());
						break;
					}
				}
				
				
			}
		}catch (Exception e) {
			System.out.println("서버소켓 미생성!!");
			System.exit(0);
		}

	}

}
