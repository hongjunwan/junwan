package Programming4;

public class Movie {
	private String title;
	private String director;
	private String production;

	public Movie() {
		title = "����������";
		director = "�ƹ���";
		production = "����";
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
