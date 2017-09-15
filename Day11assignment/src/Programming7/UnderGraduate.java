package Programming7;

public class UnderGraduate extends Student {
	private String group;

	public UnderGraduate(String name, String number, String major, String year, int gradeNum, String group) {
		super(name, number, major, year, gradeNum);
		this.group = group;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String toString() {
		super.printInfo();
		return "소속 동아리:" + group + "\n";
	}

}
