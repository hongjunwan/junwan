package test05_2;

public class Student {
	private String stuNum; // 학번
	private String name; // 이름
	private double grade; // 학점

	public Student(String stuNum, String name, double grade) {
		this.stuNum = stuNum;
		this.name = name;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [stuNum=" + stuNum + ", name=" + name + ", grade=" + grade + "]";
	}
}
