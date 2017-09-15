package test02;

public class CountThread2 implements Runnable { //인터페이스는 run하나만 있음

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("인터페이스 버전 쓰레드:" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
