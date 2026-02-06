package d260205;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient1 {

	public static void main(String[] args) {
		System.out.println("####클라이언트 프로그램####");
		try(Socket socket=new Socket("172.16.15.89", 1234)){
			System.out.println("서버와 접속했습니다.");
			InputStream in=socket.getInputStream();
			OutputStream out=socket.getOutputStream();
			while(true) {
				
				//수신된 메시지 확인하기
				while(true) {
					if(in.available()>0) {
						//byte[] recvmsg=in.readAllBytes();
						byte[] recvmsg=new byte[256];
						in.read(recvmsg);
						System.out.print("서버에서 수신한 메시지:");
						System.out.println(new String(recvmsg));
						break;
					}
				}
				
				//서버에 메시지 보내기
				System.out.print("서버에 보낼 메시지 입력:");
				String msg=new Scanner(System.in).nextLine();
				out.write(msg.getBytes());
				out.flush();
				Thread.sleep(100);
			}
		}catch (Exception e) {
			System.out.println("서버와 접속이 되지 않습니다.");
			System.exit(0);
		}

	}

}
