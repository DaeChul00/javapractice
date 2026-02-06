package d260122_03;

public class BookManager {
	private Book[] books = new Book[100];
	private int index = 0;

	public BookManager() {
		insert("9788949708850", "나의투쟁", "아돌프히틀러", "동서문화사");
		insert("9791194374299", "요리를한다는것", "최강록", "클");
		insert("9791162544259", "마침내특이점이시작된다", "레이커즈와일", "비즈니스북스");
	}

	public void insert(String isbn, String title, String author, String publisher) {
		books[index] = new Book(isbn, title, author, publisher);
		index = index + 1;
	}

	public void selectAll() {
		for (int i = 0; i < index; i++) {
			if (books[i].getIsbn() != null) {
				System.out.println(books[i]);
			}
		}
	}

	public void update(String searchTitle, Book b) {
		for (int i = 0; i < index; i++) {
			if (books[i].getIsbn() != null && searchTitle.equals(books[i].getTitle())) {
				if (b.getTitle() != null) {
					books[i].setTitle(b.getTitle());
				}
				if (b.getAuthor() != null) {
					books[i].setAuthor(b.getAuthor());
				}
				if (b.getPublisher() != null) {
					books[i].setPublisher(b.getPublisher());
				}
				return;
			}
		}
	}

	public void delete(String title) {
		for (int i = 0; i < index; i++) {
			if (books[i].getIsbn() != null && books[i].getTitle().equals(title)) {
				books[i].setIsbn(null);
			}
		}
	}

	public void selectByTitle(String title) {
		int i = 0;
		for (i = 0; i < index; i++) {
			if (books[i].getIsbn() != null && books[i].getTitle().equals(title)) {
				System.out.println(books[i]);
				break;
			}
		}
		if (index == i) {
			System.out.println("해당 도서가 존재하지 않습니다.");
		}
	}

	public boolean isExist(String title) {
		for (int i = 0; i < index; i++) {
			if (books[i].getIsbn() != null && books[i].getTitle().equals(title)) {
				return true;
			}
		}
		return false;
	}

	public Book getBookByTitle(String title) {
		for (int i = 0; i < index; i++) {
			if (books[i].getIsbn() != null && books[i].getTitle().equals(title)) {
				return new Book(books[i].getIsbn(), books[i].getTitle(), books[i].getAuthor(), books[i].getPublisher());
			}
		}
		return null;
	}
}