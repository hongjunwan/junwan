package test03;

import java.util.Random;

public class Horse extends Thread {
	private String name;
	private int sleepTime;

	public Horse(String name) {
		this.name = name;
		sleepTime = new Random().nextInt(3000);
	}

	@Override
	public void run() {
		System.out.println(name + "말 출발!!");
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + "말 도착!!");
	}
}
