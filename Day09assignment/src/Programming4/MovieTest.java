package Programming4;

public class MovieTest {
	public static void main(String[] args) {
		Movie m = new Movie();
		Movie m1 = new Movie("아저씨", "몰라", "몰라");

		System.out.println("제목: " + m.getTitle());
		System.out.println("감독: " + m.getDirector());
		System.out.println("제작사: " + m.getProduction());
		System.out.println("제목: " + m1.getTitle());
		System.out.println("감독: " + m1.getDirector());
		System.out.println("제작사: " + m1.getProduction());
	}
}
