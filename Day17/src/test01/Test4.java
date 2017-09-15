package test01;

import java.util.StringTokenizer;

public class Test4 {
	public static void main(String[] args) {
		String s = "aa b ccc,dd";
		StringTokenizer st = new StringTokenizer(s); //자바.유틸패이제
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
