package d260123;

import java.io.*;

public class Main5 {
	public static void main(String[] args) throws IOException {
		//파일로부터 메모리로 데이터 가져오기(inputStream)
		//이클립스에서 파일의 기준점은 프로젝트명
		File file=new File("a.txt"); //file객체는 정보를 가지고 있다.
		FileInputStream in=new FileInputStream(file);
		System.out.println(in.available());
		String s="";
		while(in.available()>0) {
			s+=(char)in.read();
		}
		System.out.println(s);
		
		//메모리에 본인의 영문 이름을 입력하고, 스트림으로 파일에 메모리의 내용을 기록하세요.
		
		s="JEON "+s;
		FileOutputStream out=new FileOutputStream(file);
		for(byte b:s.getBytes()) {
			out.write(b);
		}
		out.flush();		
	}
}
