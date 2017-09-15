package problem17;
class Super{
	private String text;
	public int i = 0;
	public Super(String text) {
		this.text = text;
		i = 1;
	}
}
public class Sub extends Super{
	public Sub(String text) {
		super(text);
		i=2;
	}
	public static void main(String[] args) {
		Sub sub = new Sub("Hello");
		Super s = new Super("dddd");
		System.out.println(sub.i);
	}
}
