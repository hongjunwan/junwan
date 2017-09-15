package lab;

public class Student extends Human {
	private String major;

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String toString() {
		return super.toString() + " ����:" + major;
	}
	
	@Override
	public String getProfession() {
		return super.getProfession();
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("����", 21, "��ǻ��");
		Student s2 = new Student("����", 22, "�濵");
		Student s3 = new Student("����", 24, "����");
		s3.age = 1;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
