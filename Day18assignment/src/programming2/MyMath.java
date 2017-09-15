package programming2;

import java.util.ArrayList;

public class MyMath<T extends Number> {
	private double sum;
	private int count;
	private double result;

	public void add(T item) {
		sum += item.doubleValue();
		count++;
	}


	public double getAverage() {
		result = sum / count;
		return result;
	}
	
	public static void main(String[] args) {
		MyMath<Number> list = new MyMath<Number>();
		
		list.add(4);
		list.add(2);
		list.add(6.5);
		list.add(4.5);
		
		System.out.println("Æò±Õ °ª: " + list.getAverage());
	}
}
