package Programming1;

public class DogTest {
	public static void main(String[] args) {
		Dog d = new Dog(" ", 0);
		Dog d1 = new Dog(" "," ",0);
		
		d.setName("j");
		d1.setName("1");
		
		System.out.println(d.getName());
		System.out.println(d1.getName());
	}
}
