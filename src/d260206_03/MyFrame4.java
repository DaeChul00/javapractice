package d260206_03;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import d260206_01.Recv;
import d260206_01.Send;

public class MyFrame4 {

	public static void main(String[] args) {
		Frame f=new Frame();
		f.setTitle("Chating");
		f.setBounds(0,0,600,300);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		TextArea ta=new TextArea(10, 20);
		String msg="kim:hello\r\nhong:hello\r\nkim:hello2\r\nhong:hello2\r\n";
		ta.setText(msg);
		ta.setEditable(false);
		f.add(ta);
		f.add(new Label("메시지입력:"));
		TextField tmsg=new TextField(30);
		f.add(tmsg);
		f.add(new Button("전송"));
		f.revalidate(); f.repaint();
		//챗팅프로그램에서 메시지창에 값을 입력하고 enter키를 누르면 전송되는 코드도 같이 구현
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);				
			}
		});
		
		//메시지 보내기전에 소켓을 연결하는 작업을 생성자에서 처리
		//콘솔상에서는 send, Recv객체가 무한반복으로 처리중이지만
		//프레임에서는 무한반복하면 안됨
		try(Socket socket=new Socket("172.16.15.90", 1234)){
			System.out.println("서버에 접속했습니다.");
(new Send(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())))).start();//송신쓰레드
(new Recv(new BufferedReader(new InputStreamReader(socket.getInputStream())))).start();//수신쓰레드
			while(true) {Thread.sleep(100);}
		}catch (Exception e) {
			System.out.println("서버와 접속이 되지 않습니다.");
			System.exit(0);
		}
		
		
		tmsg.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar()==e.VK_ENTER) {
					System.out.println("텍스트 박스에서 엔터키를 눌렸습니다.");
					//메시지를 보내기 위해서는 tmsg의 값을 가지고 와서
					String sendmsg=tmsg.getText();
					//메시지값을 소켓으로 send시키고
					new Thread();
					//
					//수신된 값을 textArea 텍스트 상자에 입력
					ta.setText(ta.getText()+sendmsg+"\r\n");
					ta.setCaretPosition(ta.getText().length());
					//tmsg의 값을 반값을 초기화
					tmsg.setText("");
					
				}
			}
		});
	}
}
