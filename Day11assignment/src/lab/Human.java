package lab;

public class Human {
	private String name;
	protected int age;
	private String profession;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "ÀÌ¸§:" + name + "  ³ªÀÌ:" + age + "¼¼";
	}
	
	public String getProfession() {
		return "Á÷¾÷:" + profession;
	}
	
	public static void main(String[] args) {
		Human h1 = new Human("ÃáÇâ",18);
		Human h2 = new Human("¸ù·æ",21);
		Human h3 = new Human("»ç¶Ç",50);
		
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
	}
}
