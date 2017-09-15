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
		System.out.println("***********학생 정보**************");
		System.out.println("* 이름 : " + name);
		System.out.println("* 주소 : " + adrress);
		System.out.println("* 전화번호 : " + phoneNumber);
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
