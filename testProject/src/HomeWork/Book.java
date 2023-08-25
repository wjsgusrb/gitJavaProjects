package HomeWork;

public class Book {
	private int code;
	private String title;
	private String author;

	// 생성자
	public Book(int code, String title, String author) {
		this.code = code;
		this.title = title;
		this.author = author;
	}

	// Getter 메서드
	public int getCode() {
		return code;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	// Setter 메서드
	public void setCode(int code) {
		this.code = code;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	// toString 메서드
	@Override
	public String toString() {
		return "Book{" +
				"code=" + code +
				", title='" + title + '\'' +
				", author='" + author + '\'' +
				'}';
	}

}
