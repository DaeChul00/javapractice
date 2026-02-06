package d260205;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws IOException, InterruptedException {
		/*
		ServerSocket server=new ServerSocket(8080);
		if(server==null) {
			System.out.println("서버소캣오류");
		}
		System.out.println(sever);
		*/
		/*
		try(ServerSocket server=new ServerSocket(8080)){
			System.out.println(server);
			while(true) {
				if(server==null) System.out.println("중간에 소캣오류로 중단");
			}
		}catch(Exception e) {
			System.out.println("서버소캣생성오류!!");
		}
		*/
		/*
		Process p=Runtime.getRuntime().exec("notepad");
		Thread.sleep(3000);
		Runtime.getRuntime().exec("cmd /c taskkill /f /PID "+p.pid());
		System.out.println(p.pid());
		ProcessHandle.of(p.pid()).ifPresent(ph->{
			ph.destroyForcibly();
		});
		*/
		
		/*
		Process p=Runtime.getRuntime().exec("cmd /c ipconfig");
		
		BufferedReader br=new BufferedReader(
			new InputStreamReader(p.getInputStream(), "MS949")
			);
		String line;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		*/
		
		/*
		ProcessBuilder pb=new ProcessBuilder("cmd", "/c", "dir");
		pb.inheritIO(); //콘솔에 결과 출력
		pb.start();
		*/
		
		ProcessBuilder pb=new ProcessBuilder("notepad");
		Process process=pb.start();
		Thread.sleep(3000);
		//pb.wait(3000);
		process.destroy();
		
		
	}

}
