import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {

		int score;
		char grade;

		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 입력하시오: ");
		score = sc.nextInt();

		if (score >= 70) {
			grade = 'A';
		} else if (score >= 40) {
			grade = 'B';
		} else if (score >= 20) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("학점: " + grade);
	}
}
