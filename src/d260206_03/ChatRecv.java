package d260206_03;

import java.awt.TextArea;
import java.io.BufferedReader;

public class ChatRecv extends Thread {
    private BufferedReader br;
    private TextArea ta;

    public ChatRecv(BufferedReader br, TextArea ta) {
        this.br = br;
        this.ta = ta;
    }

    @Override
    public void run() {
        try {
            String msg;
            while ((msg = br.readLine()) != null) {
                ta.append(msg + "\n");
            }
        } catch (Exception e) {
            ta.append("서버와의 연결이 종료되었습니다.\n");
        }
    }
}