/*Programming 4�� ����*/

import java.util.Scanner;

public class Programming4 {
	public static void main(String[] args) {
		
		double F;
		double C;
		
		Scanner inputvalue = new Scanner(System.in);
		
		System.out.print("ȭ���� �Է��Ͻÿ�.(F): ");
		F = inputvalue.nextDouble();
		
		C = ((double) 5 / 9) *(F - 32);
		
		System.out.println("������(C): " + C);	
	}
}
