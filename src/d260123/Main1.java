package d260123;

import java.io.IOException;

public class Main1 {

	public static void main(String[] args) throws IOException {
		//입력스트림을 이용해서 키보드에서 읽어서 메모리에 입력할꺼에요
		System.out.println(System.in.available());
		int ch=System.in.read(); // "abc"+"\r\n"(enter갑포함(2))
		System.out.println(ch);
		System.out.println((char)ch);
		System.out.println(System.in.available());
		ch=System.in.read();
		System.out.println((char)ch);
		System.out.println(System.in.available());
		System.out.println("end program!!");
		

	}

}
