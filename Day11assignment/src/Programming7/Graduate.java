package Programming7;

public class Graduate extends Student {
	private String assistantType;
	private int scholarship;

	public Graduate(String name, String number, String major, String year, int gradeNum, String assistantType) {
		super(name, number, major, year, gradeNum);
		this.assistantType = assistantType;
		if (this.assistantType.equals("���� ����")) {
			scholarship = 0;
		} else {
			scholarship = 1;
		}
	}

	public String getAssistantType() {
		return assistantType;
	}

	public void setAssistantType(String assistantType) {
		this.assistantType = assistantType;
	}

	public int getScholarship() {
		return scholarship;
	}

	public void setScholarship(int scholarship) {
		this.scholarship = scholarship;
	}

	public String toString() {
		super.printInfo();
		return "���� ����:" + assistantType + " ���б� ����:" + scholarship + "\n";
	}

}
