package Programming4;

public class MovieTest {
	public static void main(String[] args) {
		Movie m = new Movie();
		Movie m1 = new Movie("������", "����", "����");

		System.out.println("����: " + m.getTitle());
		System.out.println("����: " + m.getDirector());
		System.out.println("���ۻ�: " + m.getProduction());
		System.out.println("����: " + m1.getTitle());
		System.out.println("����: " + m1.getDirector());
		System.out.println("���ۻ�: " + m1.getProduction());
	}
}
