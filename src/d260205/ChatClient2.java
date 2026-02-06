package d260205;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient2 {

	public static void main(String[] args) {
		System.out.println("####클라이언트 프로그램####");
		try(Socket socket=new Socket("172.16.15.89", 1234)){
			System.out.println("서버에 접속했습니다.");
			InputStream in=socket.getInputStream();
			OutputStream out=socket.getOutputStream();
			//서버와 메시지를 교환
			while(true) {
				//수신된 메시지 확인하기
				while(true) {
					if(in.available()>0) {
						byte[] recvmsg=new byte[256];
						int len=in.read(recvmsg);
						if(len==-1) {
							System.out.println("연결종료!!");
							System.exit(0);
						}
						System.out.print("서버에서 수신한 메시지:");
						System.out.println(new String(recvmsg,0,len));
						break;
					}
				}
				
				//서버에 메시지 보내기				
				System.out.print("서버에 보낼 메시지 입력:");
				String msg=new Scanner(System.in).nextLine(); //챗팅 뛰워쓰기 가능하므로 nextLine사용
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