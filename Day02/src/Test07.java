import java.util.Scanner;

/*��ȭ->�޷�*/

public class Test07 {
	public static void main(String[] args) {
		
		int money;
		double rate = 1117.7;
		double dollar;
		
		Scanner inputmoney = new Scanner(System.in);
		
		
		System.out.print("��ȭ�� �Է��Ͻÿ�.: ");
		money = inputmoney.nextInt();
		
		dollar = money / rate;
		
		System.out.println("��ȭ�� ���� �޷�: " + dollar + "$");
		
		
	}
}
