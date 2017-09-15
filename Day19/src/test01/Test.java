package test01;

public class Test {
	public static void main(String[] args) {
		String msg = "메인쓰레드";
		
		CountThread t = new CountThread(); //쓰레드 돌림 //메인에서는 원래 실행하면 그 실행된게 끝날때까지 밑에게 실행이 안되지만
										   //쓰레드는 이것도 실행시키고 아래 것도 실행시킨다.
		t.start();

		for (int i = 10; i > 0; i--) {
			System.out.println(msg + ":" + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
