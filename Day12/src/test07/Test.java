package test07;

public class Test {
	public static void main(String[] args) {
//		Television tv = new Television();		
//		tv.turnOn();
		
		Remocon remocon = new Television();
		remocon.turnOn();
		
		remocon = new Aircon();
		remocon.turnOn();
		remocon.turnOff();
	}
}
