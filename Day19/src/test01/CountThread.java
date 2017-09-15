package test01;

public class CountThread extends Thread{
	@Override
	public void run() {
		//현재 CountThread에게 시킬 작업지시서 작성 부분
		for(int i = 0; i<20; i++) {
			System.out.println("CountThread 작업중:" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
