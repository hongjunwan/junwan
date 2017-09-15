/*problem1 */
/* 삼항연산자 연습문제
사용자로부터 점수(int)를 입력 받아서 사용자가 입력한 점수가 50 이상이면
당신의 성적은 A 입니다, 50 미만이면 당신의 성적은 B입니다. 라는 문구가
출력되는 프로그램을 작성하시오.
<실행예>
점수를 입력하시오:70
당신의 성적은 A입니다.*/

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		
		int score;
		char grade;
		
		Scanner inputvalue = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오: ");
		score = inputvalue.nextInt();
		
		grade = (score >= 50)? 'A':'B';
		
		System.out.println("당신의 성적은 " + grade + "입니다.");	
	}
}
