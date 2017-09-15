package programming2_1;

import java.util.Date;

public class Test {
	public static void main(String[] args) {
		
	DateText d = new DateText();
	d.start();
	
	for(int x = 0; x < 10; x++) {
		Date t = new Date();
		System.out.println(t + "안녕히 계세요.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
