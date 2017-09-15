package Programming4;

public class Magazine extends Book {
	private String dateOfIssue;

	public Magazine(String name, String pageN, String author, String dateOfIssue) {
		super(name, pageN, author);
		this.dateOfIssue = dateOfIssue;
	}

	public String getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}
	
	public String toString() {
		super.printInfo();
		return " πﬂ∏≈¿œ:"+dateOfIssue;
	}
}
