package test03;

public class Test {
	public static void main(String[] args) {
		for (int i = 10; i > 0; i--) {
			System.out.println("ī��Ʈ�ٿ�:" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}