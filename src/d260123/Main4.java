package d260123;

import java.io.IOException;

public class Main4 {

	public static void main(String[] args) throws IOException {
		// 출력스트임 outputStream : 메모리에서 나오는 스트림
		// 'a'문자는 메모리에 저장된 데이터
		char c='a';
		System.out.write(c);
		//System.out은 모니터로 가는 스트림
		//스트림으로 보내는 상태이므로 화면에 나타나지는 않음
		System.out.write('자'); //write는 1byte처리이므로 한글 깨짐
		System.out.flush();
		System.out.print('자'); //print는 2byte처리이므로 한글 안깨짐
		
	}

}
