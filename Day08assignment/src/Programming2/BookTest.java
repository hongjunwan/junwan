package Programming2;

public class BookTest {
	public static void main(String[] args) {
		Book b = new Book();
		
		b.setTitle("õ���� ��");
		b.setAuthor("�����ó� ���̰�");
		
		System.out.println("����: " + b.getTitle());
		System.out.println("����: " + b.getAuthor());
	}
}
