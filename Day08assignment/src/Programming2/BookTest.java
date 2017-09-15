package Programming2;

public class BookTest {
	public static void main(String[] args) {
		Book b = new Book();
		
		b.setTitle("천공의 별");
		b.setAuthor("히가시노 게이고");
		
		System.out.println("제목: " + b.getTitle());
		System.out.println("저자: " + b.getAuthor());
	}
}
