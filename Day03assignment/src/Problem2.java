
/*problem2*/
/* 삼항연산자 연습문제2
위의 성적 프로그램의 기준을 70이상,40이상-70미만, 40미만 세 등급으로 나누어
각각 A,B,C의 성적을 출력해 주는 프로그램을 작성하시오.
(조건문 if 또는 switch 사용 금지)
<실행예>
점수를 입력하시오:50
당신의 성적은 B입니다.*/

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {

		int score;
		char grade;

		Scanner inputvalue = new Scanner(System.in);
		
			System.out.print("점수를 입력하시오: ");
			score = inputvalue.nextInt();

			grade = (score >= 70) ? 'A' : (score >= 40) ? 'B' : 'C';

			System.out.println("당신의 성적은 " + grade + "입니다.");
		
	}
}
