package programming3;

public class Test {
	public static void main(String[] args) {
		Controllable c = new Controllable() {
			public void play() {
				System.out.println("Ω√¿€");
			}

			public void stop() {
				System.out.println("∏ÿ√„");
			}
		};
		c.play();
		c.stop();
	}
}
