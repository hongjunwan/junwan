package test01;

public class CountThread extends Thread{
	@Override
	public void run() {
		//���� CountThread���� ��ų �۾����ü� �ۼ� �κ�
		for(int i = 0; i<20; i++) {
			System.out.println("CountThread �۾���:" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
