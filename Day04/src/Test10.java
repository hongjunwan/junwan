import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		int dan;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���: ");
		dan = sc.nextInt();
		
		System.out.println("������ ����");
		for(int i = 1; i <= 9; i++)
			System.out.println(dan + "x" + i + "=" + dan * i);
	}
}
