package Programming1;

public class Dog {
	private String name;
	public String breed;
	private int age;
	
	public Dog(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public Dog(String name, String breed, int age) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	}
	
	public void setName(String name) {
		this.breed = name;
	}
	public String getName() {
		return breed;
	}
}
