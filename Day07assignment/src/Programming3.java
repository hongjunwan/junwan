import java.util.Scanner;

public class Programming3 {
	public static void main(String[] args) {
		
		int stnumber, grade;
		double gradeavg;
		int[] student; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�л��� ���� �Է��Ͻÿ�: ");
		stnumber = sc.nextInt();
		student = new int[stnumber];
		
		for(int x = 0; x < stnumber; x++) {
			System.out.print("�л�" + (x+1) +"�� ������ �Է��Ͻÿ�: ");
			grade = sc.nextInt();
			
			if(grade < 0 || grade > 100) {
				while(grade < 0 || grade > 100) {
				System.out.println("�߸��� �����Դϴ�. �ٽ� �Է��Ͻÿ�.");
				System.out.print("�л�" + (x+1) +"�� ������ �Է��Ͻÿ�: ");
				grade = sc.nextInt();
				}
			}
			student[x] = grade;
		}
		
		grade = 0;
		
		for(int x = 0; x < stnumber; x++) {
			grade = grade + student[x];
		}
		
		gradeavg = (double)grade / stnumber;
		
		System.out.println("���� ����� " + gradeavg + "�Դϴ�.");
	}
}
