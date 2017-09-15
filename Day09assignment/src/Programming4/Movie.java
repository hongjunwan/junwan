package Programming4;

public class Movie {
	private String title;
	private String director;
	private String production;

	public Movie() {
		title = "¹ÝÁöÀÇÁ¦¿Õ";
		director = "¾Æ¹«³ª";
		production = "¸ô¶ó";
	}

	public Movie(String title, String director, String production) {
		this.title = title;
		this.director = director;
		this.production = production;
	}

	public String getTitle() {
		return title;
	}

	public String getDirector() {
		return director;
	}

	public String getProduction() {
		return production;
	}

}
