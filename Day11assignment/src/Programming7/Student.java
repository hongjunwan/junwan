package Programming7;

public class Student {
	private String name;
	private String number;
	private String major;
	private String year;
	private int gradeNum;

	public Student(String name, String number, String major, String year, int gradeNum) {
		this.name = name;
		this.number = number;
		this.major = major;
		this.year = year;
		this.gradeNum = gradeNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getGradeNum() {
		return gradeNum;
	}

	public void setGradeNum(int gradeNum) {
		this.gradeNum = gradeNum;
	}

	public void printInfo() {
		System.out.println("이름:" + name + " 학번:" + number + "\n소속 학과:" + major + " 학년:" + year + " 이수학점 수:" + gradeNum);
	}
}
