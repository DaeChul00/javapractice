package d260123_01;

import java.io.*;
import java.util.*;

public class Main1 {

	public static void main(String[] args) throws IOException {
		//작업순서
		/*
		1)phonebook.txt 파일의 내용을 메모리 로드한다.
		2)메모리에 로드된 줄단위 내용을 분리한다.
		3)분히된 데이터를 phonebook객체로 생성한다.
		4)생성된 phonebook객체는 리스트 형태로 관리한다.	 
		*/
		File file=new File("phonebook.txt");
		FileReader reader=new FileReader(file);
		BufferedReader br=new BufferedReader(reader);
		
		String buf="";
		List<Phonebook> list=new ArrayList<Phonebook>();
		List<Phonebook> list2=new LinkedList<Phonebook>();
		while((buf=br.readLine())!=null) {
			//System.out.println(buf);
			String[] datas=buf.split(" ");
			int id=Integer.parseInt(datas[0]);
			String name=datas[1];
			String hp=datas[2];
			String email=datas[3];
			
			//System.out.printf("%d %s %s %s\n", id, name, hp, email);
			Phonebook pb=new Phonebook(id, name, hp, email);
			list.add(pb);
		}

		System.out.println(list);
		//새로운 phonebook 객체를 생성하고 객체의 모든 내용을 텍스트파일 형식으로 쓰기하시오
		Phonebook pb2=new Phonebook(6, "김민수", "010-6666-6666", "min@gmail.com");
		list.add(pb2);
		System.out.println("전체list출력");
		System.out.println(list);
		/*
		BufferedWriter writer=new BufferedWriter(new FileWriter("Phonebook.txt", true));
		writer.newLine();
		writer.write(pb2.getId()+ " " + pb2.getName()+ " " +pb2.getHp()+ " " +pb2.getEmail()+ " ");
		writer.close();
		*/
		BufferedWriter bw=new BufferedWriter(new FileWriter("phonebook.txt"));
		
		int index=1;
		for(Phonebook p:list) {
			String inputdata
			=p.getId()+" "+p.getName()+" "+p.getHp()+" "+p.getEmail();
			bw.write(inputdata);
			if(index!=list.size()) {
				bw.newLine();
			}
			index++;
		}
		bw.flush();
		bw.close();
		
		//전화번호부 관리프로그램에 파일불러오기 함수를 만들고 이를 초기화시 적용하시오
		
		
	}

}
