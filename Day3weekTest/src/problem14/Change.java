package problem14;

public class Change {
	static String str = "ABC123";
	public static void change(String str) {
		Change.str += "456";
	}
	public static void main(String[] args) {
		String str = "ABC123123";
		System.out.println(str);
		change(str);
		System.out.println("After:" + Change.str);
	}
}
