package d260209_01;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class AttentionClient {

	public static void main(String[] args) {
			//아래의 코드는 콘솔상에서 무한반복 시 사용하지만 프레임을 경우는 이벤트가 발생할 때 아래코드가 실행
		/*
			try(Socket socket=new Socket("172.16.15.97",1234)){
				while(true) {
					
				}
			}
		*/
		
		//이벤트 발생시는 프레임을 처리
		Frame f=new Frame();
		f.setBounds(0,0,400,300);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		Button attbtn=new Button("입실");
		Button exitbtn=new Button("퇴실");
		f.add(attbtn); f.add(exitbtn);
		f.revalidate();f.repaint();
		
		//프레임은 이벤트 발생시 어떤 동작을 하게 됨, 즉 버튼을 눌렀을 때 리스너를 추가하여 처리
		attbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//출석 버튼을 눌렀을 때 연결하기
				try(Socket socket=new Socket("172.16.15.97",1234)){
					System.out.println("출석연결!");
				}catch (Exception e2) {}
			}
		});
		
		
		exitbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//퇴실버튼 클릭시 socket close 해야함
				//서버에 현재 출석을 종료하겠습니다.라고 알려되는 상황
				//서버에 메시지를 보내서 버튼색을 빨간색으로 변경
				//메시지 전달로 퇴실을 체크하는 상황
				
			}
		});

		//윈도우 닫기 리스너
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
			//프로그램 x버튼을 클릭시 socket close 해야함
			//서버에 현재 출석을 종료하겠습니다.라고 알려되는 상황
			//메시지 전달로 퇴실을 체크하는 상황
			System.exit(0);
			}
		});
		
		//예외상황 :  프로그램 정지 [ㅁ]
		//메시지 전달없이 퇴실을 체크하는 상황
				
		Runtime.getRuntime().addShutdownHook(new Thread(() -> {
			System.out.println("프로그램 종료 감지!");
		}));
		
		// 익명함수 사용방법/call back/백그라운드에서 돌아가는 함수 : ()->{}
	}

}