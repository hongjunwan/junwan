package programming1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Die d = new Die();
		int value;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println(d);
		System.out.println("***주사위 면 설정***");
		System.out.print("면을 입력하세요: ");
		value = s.nextInt();
		if(value > 6 || value <1) {
			System.out.println("잘못 입력하셨습니다.(범위는 1~6)");
		}
		else {
			System.out.println("***주사위 굴리기***");
			d.roll();
			System.out.println("굴린 후 주사위 면은 " + d.getValue() + "면 입니다.");
		}
	}
}
