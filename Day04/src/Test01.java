import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		int score;
		char grade;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�: ");
		score = sc.nextInt();
		
		if(score >= 50){
			grade = 'A';
		}
		else{
			grade = 'F';
		}
		System.out.println("����: " + grade);
	}
}
