import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		
		int value1, value2, value3;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("3���� ������ �Է��Ͻÿ�: ");
		value1 = sc.nextInt();
		value2 = sc.nextInt();
		value3 = sc.nextInt();
		
		avg = (value1 + value2 + value3) / (double)3;
        
		System.out.println("��� ��: " + avg);
	}
}
