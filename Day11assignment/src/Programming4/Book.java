package Programming4;

public class Book {
	private String title;
	private String pageN;
	private String author;

	public Book(String title,String pageN,String author) {
		this.title = title;
		this.pageN = pageN;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPageN() {
		return pageN;
	}

	public void setPageN(String pageN) {
		this.pageN = pageN;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public void printInfo() {
		System.out.print("力格:"+title+" 其捞瘤荐:"+pageN+" 历磊:"+author);
	}
}
