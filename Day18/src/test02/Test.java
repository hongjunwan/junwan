package test02;

public class Test {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.setData("Hello");
		String s = box.getData();
		
		Box<Integer> box2 = new Box<Integer>();
		box2.setData(100);
		int result = box2.getData();
		}
}
