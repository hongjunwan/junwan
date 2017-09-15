/*Programming 3번 문제*/

import java.util.Scanner;

public class Programming3 {
	public static void main(String[] args) {
		
		double r;
		double volume;
		
		Scanner inputvalue = new Scanner(System.in);
		
		System.out.print("구의 반지름을 입력하시오.: ");
		r = inputvalue.nextDouble();
		
		volume = ((double)4 / 3) * Math.pow(r, 3);
		
		System.out.println("구의 부피는: " + volume);
	}
}
