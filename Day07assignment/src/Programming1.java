import java.util.Scanner;

public class Programming1 {
	public static void main(String[] args) {
		final int ARR_SIZE = 10;

		int number, rnumber;
		int[] reservation = new int[ARR_SIZE];

		Scanner sc = new Scanner(System.in);

		for (int x = 0; x < ARR_SIZE; x++) { // 배열 초기화
			reservation[x] = 0;
		}

		while (true) {
			System.out.print("좌석을 예약하시겠습니까?(1 또는 0) ");
			number = sc.nextInt();

			if (number == 1) {

				System.out.println("현재의 예약 상태는 다음과 같습니다.");
				System.out.println("---------------------------");
				
				System.out.print("좌석 번호:");
				for (int x = 1; x <= ARR_SIZE; x++) {
					System.out.print(" " + x);
				}
				
				System.out.println();
				System.out.println("---------------------------");
				
				System.out.print("예약 상태:");
				for (int x = 0; x < ARR_SIZE; x++) {
					System.out.print(" " + reservation[x]);
				}
				
				System.out.println();
				System.out.print("몇번째 좌석을 예약하시겠습니까? ");
				rnumber = sc.nextInt();

				reservation[rnumber - 1] = 1;

				System.out.println("예약되었습니다.");
				
				System.out.print("현재 예약 상태:");
				for (int x = 0; x < ARR_SIZE; x++) {
					System.out.print(" " + reservation[x]);
				}
				System.out.println();
			} 
			else {
				System.out.println("종료되었습니다.");
				break;
			}
		}
	}
}
