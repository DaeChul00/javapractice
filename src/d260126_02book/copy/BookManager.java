package d260126_02book.copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import d260126_01.Phonebook;

public class BookManager {
	private List<Book> book=new ArrayList<Book>();

	public BookManager() {
		fileload("book.txt");
	}

	public boolean filesave(String filename) {
		try {
		BufferedWriter bw
		=new BufferedWriter(new FileWriter(filename));
		int i=0;
		for(Book b:book) {
		bw.write(
				b.getIsbn() + " " +
				b.getTitle() + " " +
				b.getAuthor() + " " +
				b.getPublisher()
				);
			if(i!=(book.size()-1)) {
			bw.newLine();
			}
			i++;
		}
		bw.flush();
		bw.close();
		return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public void fileload(String filename) {
		book=new ArrayList<Book>();
		//index=0;
		//phonebook.txt파일을 메모리로 로드
		try {
			BufferedReader br
			=new BufferedReader(new FileReader(filename));
			String data="";
			while((data=br.readLine())!=null) {
				insert(
				(data.split(" ")[0])
				,data.split(" ")[1]
				,data.split(" ")[2]
				,data.split(" ")[3]
				);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void insert(String isbn, String title, String author, String publisher) {
		book.add(new Book(isbn, title, author, publisher));
		//index = index + 1;
	}

	public void selectAll() {
		for (Book b:book) {
			if (b.getIsbn() != null) {
				System.out.println(b);
			}
		}
	}

	public void update(String searchTitle, Book b) {
		for (Book _b:book) {
			if (_b.getIsbn() != null && searchTitle.equals(_b.getTitle())) {
				if (b.getTitle() != null) {
					_b.setTitle(b.getTitle());
				}
				if (b.getAuthor() != null) {
					_b.setAuthor(b.getAuthor());
				}
				if (b.getPublisher() != null) {
					_b.setPublisher(b.getPublisher());
				}
				return;
			}
		}
	}

	public void delete(String title) {
		/*
		for (int i = 0; i < index; i++) {
			if (books[i].getIsbn() != null && books[i].getTitle().equals(title)) {
				books[i].setIsbn(null);
			}
		}
		*/
		Iterator<Book> it=book.iterator();
		while(it.hasNext()) {
			Book b=it.next();
			if(b.getTitle().equals(title)) {
				it.remove();
				break;
			}
		}
	}

	public void selectByTitle(String title) {
		int i = 0;
		for (Book b:book) {
			if (b.getTitle().equals(title)) {
				System.out.println(b);
				break;
			}
		}
		if (book.size() == i) {
			System.out.println("해당 도서가 존재하지 않습니다.");
		}
	}

	public boolean isExist(String title) {
		for (Book b:book) {
			if (b.getTitle().equals(title)) {
				return true;
			}
		}
		return false;
	}

	public Book getBookByTitle(String title) {
		//int i=0;
		for (Book b:book) {
			if (b.getTitle().equals(title)) {
				return new Book(b.getIsbn(), b.getTitle(), b.getAuthor(), b.getPublisher());
			}
		}
		return null;
	}
}