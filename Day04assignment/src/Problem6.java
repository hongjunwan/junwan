import java.util.Scanner;

public class Problem6 {
	public static void main(String[] args) {
		
		int Score;
		int TenPositionScore;
		char Grade;
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("점수를 입력하시오: ");
		Score = sc.nextInt();
		TenPositionScore = Score / 10;
		
		switch(TenPositionScore){
		case 10:
		case 9:
			Grade = 'A';
			break;
		case 8:
			Grade = 'B';
			break;
		case 7:
			Grade = 'C';
			break;
		case 6:
			Grade = 'D';
			break;
		default:
			Grade = 'F';
			break;
		}
		System.out.println("성적: " + Grade);
	}
}
