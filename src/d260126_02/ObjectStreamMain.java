package d260126_02;

import java.io.*;

public class ObjectStreamMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("object.ser"));
		Phonebook pb=new Phonebook(1, "홍길동", "010-1111-1111", "hong@gmail.com");
		out.writeObject(pb);
		*/
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("object.ser"));
		
		Phonebook p=(Phonebook)ois.readObject();
		System.out.println(p);
		
	}

}
