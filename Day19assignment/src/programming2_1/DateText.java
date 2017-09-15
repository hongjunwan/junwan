package programming2_1;

import java.util.Date;

public class DateText extends Thread {
	@Override
	public void run() {
		for (int x = 0; x < 10; x++) {
			Date d = new Date();
			System.out.println(d + "¾È³çÇÏ¼¼¿ä");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
