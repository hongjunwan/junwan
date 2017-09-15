package Exercise4;

public class MyMetric {
	private static double kilometer = 4;
	private static double mile = 5;
	
	public static double kiloToMile() {
		 return kilometer / 1.609344;
	}
	public static double mileToKilo() {
		return mile * 1.609344;
	}
}
