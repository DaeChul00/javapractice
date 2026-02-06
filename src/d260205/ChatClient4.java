package d260205;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient4 {

	public static void main(String[] args) {
		System.out.println("####클라이언트 프로그램####");
		try(Socket socket=new Socket("172.16.15.89", 1234)){
			System.out.println("서버에 접속했습니다.");
			
			BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//서버와 메시지를 교환
			while(true) {
				String command=br.readLine();
				ProcessBuilder pb=new ProcessBuilder(command);
				pb.start();
			}
				
		}catch (Exception e) {
			System.out.println("서버와 접속이 되지 않습니다.");
			System.exit(0);
		}

	}

}