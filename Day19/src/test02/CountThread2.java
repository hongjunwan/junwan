package test02;

public class CountThread2 implements Runnable { //�������̽��� run�ϳ��� ����

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("�������̽� ���� ������:" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
