package d260123;

import java.io.*;

public class Main6 {

	public static void main(String[] args) throws IOException {
		//입력스트림은 파일이 존재하지 않을 경우 오류 방생
		//FileInputStream fin=new FileInputStream("b.txt");
		
		//출력스트림은 파일이 없을 경우 자동으로 파일 생성
		//FileOutputStream fout=new FileOutputStream("b.txt");
		
		//파일 객체는 파일의 정보를 확인하기 위한 객체
		//File file=new File("꿀벌.webp");
		//System.out.println(file.getAbsolutePath());
		
		//파일의 데이터를 출력
		String s="";
		FileInputStream in=new FileInputStream("꿀벌.webp");
		while(in.available()>0) {
			s+=(char)in.read();
		}
		System.out.println(s);
	}

}
