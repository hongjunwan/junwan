package programming6;

public class Student {
	private String name;
	private String adrress;
	private String phoneNumber;

	public Student(String name, String adrress, String phoneNumber) {
		this.name = name;
		this.adrress = adrress;
		this.phoneNumber = phoneNumber;
	}

	public void printAccount() {
		System.out.println("***********�л� ����**************");
		System.out.println("* �̸� : " + name);
		System.out.println("* �ּ� : " + adrress);
		System.out.println("* ��ȭ��ȣ : " + phoneNumber);
		System.out.println("**********************************");
	}

	///////////////////////////////////////////////////
	// getter

	public String getName() {
		return name;
	}

	public String getAdrress() {
		return adrress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

}
