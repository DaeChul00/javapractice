package d260206_03;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.Socket;

public class ChatFrame extends Frame {
    TextArea ta;
    TextField tf;
    Button btn;
    Socket socket;
    BufferedWriter bw;

    public ChatFrame() {
        setTitle("Chating Client");
        setBounds(100, 100, 400, 400);
        setLayout(new BorderLayout());

        ta = new TextArea();
        ta.setEditable(false);
        add(ta, BorderLayout.CENTER);

        Panel p = new Panel(new BorderLayout());
        tf = new TextField();
        btn = new Button("전송");
        p.add(new Label(" 입력: "), BorderLayout.WEST);
        p.add(tf, BorderLayout.CENTER);
        p.add(btn, BorderLayout.EAST);
        add(p, BorderLayout.SOUTH);

        tf.addActionListener(e -> sendMessage());
        btn.addActionListener(e -> sendMessage());

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) { System.exit(0); }
        });

        setVisible(true);
        connect();
    }

    private void connect() {
        try {
            // 소켓 연결 (기존 MultiChatClient.java의 포트 1234 사용)
            socket = new Socket("172.16.15.90", 1234); 
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // 수신 쓰레드 분리 실행 (GuiRecv 사용)
            new ChatRecv(br, ta).start();
            ta.append("서버에 접속되었습니다.\n");
        } catch (Exception e) {
            ta.append("서버 접속 실패..\n");
        }
    }

    private void sendMessage() {
        String msg = tf.getText().trim();
        if (!msg.isEmpty()) {
            // 송신 클래스 분리 호출 (기존 Send.java 역할)
            new ChatSend(bw, msg).start(); 
            ta.append("[나]: " + msg + "\n");
            tf.setText("");
            tf.requestFocus();
        }
    }

    public static void main(String[] args) {
        new ChatFrame();
    }
}