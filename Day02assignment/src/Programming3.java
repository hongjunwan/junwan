/*Programming 3�� ����*/

import java.util.Scanner;

public class Programming3 {
	public static void main(String[] args) {
		
		double r;
		double volume;
		
		Scanner inputvalue = new Scanner(System.in);
		
		System.out.print("���� �������� �Է��Ͻÿ�.: ");
		r = inputvalue.nextDouble();
		
		volume = ((double)4 / 3) * Math.pow(r, 3);
		
		System.out.println("���� ���Ǵ�: " + volume);
	}
}
