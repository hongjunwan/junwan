package test02;

public class Test {
	public static void main(String[] args) {
		CountThread2 t = new CountThread2();
		Thread tt = new Thread(t);

		for (int i = 10; i > 0; i++) {
			System.out.println("CountTthrea ÀÛ¾÷Áß:" + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
