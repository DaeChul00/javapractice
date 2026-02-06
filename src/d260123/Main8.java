package d260123;

import java.io.*;
import java.util.Arrays;

public class Main8 {

	public static void main(String[] args) throws IOException {
		//Buffer는 완충역할을 한다.
		//아래는 기본구조로서 inputstream에 해당하는 데이터가 존재해야함
		//inputStream은 데이터이므로 FileInputStream로 여기에 위치할 수 있음
		/*
		BufferedInputStream bis=new BufferedInputStream(new InputStream() {
			
			String s="hello java";
			byte[] data=s.getBytes();
			private int index=0; //위치값
			
			@Override
			public int read() throws IOException {
				if(index>=data.length) {
					return -1; //EOF
				}
				return data[index++] & 0xff;
			}
		});
		
		System.out.println(bis.available());
		
		while(bis.available()>0) {
			System.out.print((char)bis.read());
		}

		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		*/
		
		//new InputStreamReader(null).read(); //데이터를 변수로 부터
		//new FileInputStream(null).readAllBytes(); //데이터를 파일로 부터
		
		byte[] bytes=new byte[1024];
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("c.txt"));
		//값의 리턴을 통해서 bytes배열에 값을 담는 구조
		bytes=bis.readAllBytes(); //배열객체
		System.out.println(bytes);
		System.out.println(new String(bytes)); //문자로 변환
		System.out.println(Arrays.toString(bytes)); //배열안의 값을 리스트로 표현
		//함수에 바이트배열의 변수를 입력값으로 주면 bytes변수 안에 값을 담는 구조
		//new InputStreamReader(null).read(bytes);
		
		//여러줄의 데이터를 제어할 때 1번째 줄에 있는 데이터만을 출력하고 싶은 경우
		//어떻게 처리를 하는가? 이문제를 해결하기 위해서 라인단위로 데이터를 읽을 수 있는 스트림이 존재
		
		FileReader reader=new FileReader("c.txt");
		reader.read(); //read함수 밖에 읽기할 함수가 없음
		//BufferedReader reader2=new BufferedReader(new Reader());
		BufferedReader reader2=new BufferedReader(new FileReader(new File("c.txt")));
		System.out.println(reader2.readLine());
		//줄 단위로 계속해서 읽어오는 방법
		String s="";
		while((s=reader2.readLine())!=null) {
			System.out.println(s);
		}
		
		//파일에 줄단위로 쓰기
		//BufferedWriter writer=new BufferedWriter(new Writer());
		s="AWS 보안 프로그래밍";
		//BufferedWriter writer=new BufferedWriter(new FileWriter(new File("c.txt")));
		BufferedWriter writer=new BufferedWriter(new FileWriter("c.txt", true));
		writer.newLine();
		writer.append(s);
		writer.close();
		//문제점:기존파일의 내용이 삭제됨
		//new BufferedWriter(new FileWriter("c.txt", true));
		//추가방법 writer.write(s); writer.newLine();
		
		
	}

}
