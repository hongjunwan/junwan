import java.util.Scanner;

public class Programming3 {
	public static void main(String[] args) {
		
		int stnumber, grade;
		double gradeavg;
		int[] student; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생의 수를 입력하시오: ");
		stnumber = sc.nextInt();
		student = new int[stnumber];
		
		for(int x = 0; x < stnumber; x++) {
			System.out.print("학생" + (x+1) +"의 성적을 입력하시오: ");
			grade = sc.nextInt();
			
			if(grade < 0 || grade > 100) {
				while(grade < 0 || grade > 100) {
				System.out.println("잘못된 성적입니다. 다시 입력하시오.");
				System.out.print("학생" + (x+1) +"의 성적을 입력하시오: ");
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
		
		System.out.println("성적 평균은 " + gradeavg + "입니다.");
	}
}
