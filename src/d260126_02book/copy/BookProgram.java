package d260126_02book.copy;

import java.io.IOException;
import java.util.Scanner;

public class BookProgram {
	BookManager bm = new BookManager();
	Scanner scan = new Scanner(System.in);
	String isbn;
	String title;
	String author;
	String publisher;
	String searchTitle;

	public BookProgram() throws IOException {
		while (true) {
			switch (menu()) {
			case 1:
				insert();
				break;
			case 2:
				views();
				break;
			case 3:
				view();
				break;
			case 4:
				update();
				break;
			case 5:
				delete();
				break;
			case 6:
				fileload();
				break;
			case 7:
				filesave();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}
	}

	private void filesave() {
		System.out.println("로드할 파일을 입력하세요.");
		String filename=scan.next();
		if(bm.filesave(filename)) {
			System.out.println("파일이 저장이 되었습니다.");
			return;
		}else {
			System.out.println("파일이 저장이 실패했습니다.");
		}
		
	}

	private void fileload() {
		System.out.println("로드할 파일을 입력하세요.");
		String filename=scan.next();
		bm.fileload(filename);
		
	}

	public int menu() {
		System.out.println("\n+================+");
		System.out.println("|   도서 관리 프로그램  |");
		System.out.println("+==================+");
		System.out.println("|  1. 도서 등록       |");
		System.out.println("|  2. 도서 전체 출력   |");
		System.out.println("|  3. 도서 찾기       |");
		System.out.println("|  4. 도서 수정       |");
		System.out.println("|  5. 도서 삭제       |");
		System.out.println("|  6. 도서 파일로드    |");
		System.out.println("|  7. 도서 저장       |");
		System.out.println("|  0. 프로그램 종료    |");
		System.out.println("+==================+");
		System.out.print("선택: ");
		return scan.nextInt();
	}

	public void insert() {
		System.out.println("ISBN을 입력하세요.");
		isbn = scan.next();
		System.out.println("도서 제목을 입력하세요.");
		title = scan.next();
		System.out.println("저자를 입력하세요.");
		author = scan.next();
		System.out.println("출판사를 입력하세요.");
		publisher = scan.next();
		bm.insert(isbn, title, author, publisher);
	}

	public void views() throws IOException {
		bm.selectAll();
		System.out.println("Press Enter to continue...");
		System.in.read();
	}

	public void view() throws IOException {
		System.out.println("찾을 도서 제목을 입력하세요.");
		searchTitle = scan.next();
		bm.selectByTitle(searchTitle);
		System.in.read();
	}

	public void update() {
		if (scan.hasNextLine()) {
			scan.nextLine();
		}
		System.out.println("수정할 도서의 제목을 입력하세요.");
		searchTitle = scan.nextLine();

		if (bm.isExist(searchTitle)) {
			System.out.println("변경할 제목을 입력하세요 [변경사항 없으면 Enter]");
			title = scan.nextLine();
			System.out.println("변경할 저자를 입력하세요 [변경사항 없으면 Enter]");
			author = scan.nextLine();
			System.out.println("변경할 출판사를 입력하세요 [변경사항 없으면 Enter]");
			publisher = scan.nextLine();

			Book b = bm.getBookByTitle(searchTitle);
			if (!title.equals("")) {
				b.setTitle(title);
			}
			if (!author.equals("")) {
				b.setAuthor(author);
			}
			if (!publisher.equals("")) {
				b.setPublisher(publisher);
			}

			bm.update(searchTitle, b);
		} else {
			System.out.println("수정할 도서가 존재하지 않습니다.");
		}
	}

	public void delete() {
		System.out.println("삭제할 도서 제목을 입력하세요.");
		searchTitle = scan.next();
		if (bm.isExist(searchTitle)) {
			bm.delete(searchTitle);
			System.out.println("삭제가 완료되었습니다.");
		} else {
			System.out.println("삭제할 도서가 없습니다.");
		}
	}
}