package d260206_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.List;

public class MultiRecv extends Thread {
	Socket socket;
	List<Socket> socketlist;

	public MultiRecv(Socket socket, List<Socket> socketlist) {
		this.socket = socket;
		this.socketlist = socketlist;
	}

	@Override
	public void run() {
		//수신 후에 송신처리
		while(true) {
			try {
				BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				socket.getInputStream();
				String recvmsg = br.readLine();
				System.out.print("수신메시지:" + recvmsg);
				//수신된 메시지와 리스트를 전달하여 메시지 보내기 쓰레드 작업
				//(new MultiSend(socketlist, recvmsg)).start(); //나의 소캣을 확일할 수 없음
				(new MultiSend(socketlist,recvmsg,socket)).start();
			}catch(Exception e) {
				try {
					socket.close();
				}catch (IOException e1) {
					e1.printStackTrace();
				}
				socketlist.remove(socketlist.indexOf(socket));
				System.out.println("1명이 채팅방을 나갔습니다.");
				System.out.println("현재접속자수:"+socketlist.size());
				break;
			}		
		}
	}
}
