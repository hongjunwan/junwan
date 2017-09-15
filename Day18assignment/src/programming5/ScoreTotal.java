package programming5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ScoreTotal {
	public static void main(String[] args) {
		int count = 0;
		ArrayList<Double> scoreList = new ArrayList<Double>();
		double score;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("점수를 입력하세요: ");
			score = sc.nextInt();

			if (score >= 0 && score <= 10.0) {
				scoreList.add(score);
				count++;
			} else {
				System.out.println("다시 입력하세요.");
			}
			if (count > 9) {
				break;
			}
		}
		
		Collections.sort(scoreList);
		
		System.out.println("*********점수*********");
		
		for(int x = 1; x <scoreList.size()-1; x++){
			System.out.print(scoreList.get(x) + " ");
		}
		
	}
}
