package d260204;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyWebServer3 {

	public static void main(String[] args) {

		System.out.println("웹서버프로그램!!");
		try (ServerSocket server=new ServerSocket(8888)){
			while(true) {
				Socket socket=server.accept();
				System.out.println("접속!");
				OutputStream out=socket.getOutputStream();
				
				File file = new File("꿀벌.webp");
				byte[] imageBytes = readFile(file);
				
				String header = ""
						+ "HTTP/1.1 200 OK\r\n"
						+ "Content-Type: image/webp\r\n"
						+ "Content-Length: " + imageBytes.length + "\r\n"
						+ "Connection: close\r\n"
						+ "\r\n";
				
				out.write(header.getBytes());
				
				out.write(imageBytes);
				out.flush();

				socket.close();
			}
		}catch(Exception e) {}
	}

	private static byte[] readFile(File file) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		FileInputStream fis = new FileInputStream(file);
		
		byte[] buffer = new byte[1024];
		int read;
		while ((read = fis.read(buffer))!= -1) {
			baos.write(buffer, 0, read);
		}
		
		fis.close();
		return baos.toByteArray();
	}

}
