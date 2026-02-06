package d260206_03;

import java.io.BufferedWriter;

public class ChatSend extends Thread {
    private BufferedWriter bw;
    private String msg;

    public ChatSend(BufferedWriter bw, String msg) {
        this.bw = bw;
        this.msg = msg;
    }

    @Override
    public void run() {
        try {
            bw.write(msg + "\r\n");
            bw.flush();
        } catch (Exception e) {
            System.out.println("송신 에러: " + e.getMessage());
        }
    }
}