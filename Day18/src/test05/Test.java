package test05;

import java.util.HashMap;

public class Test {
	public static void main(String[] args) {
		HashMap<String, Integer> javaScore = new HashMap<>();
		
		javaScore.put("양유", 30);
		javaScore.put("길동", 45);
		javaScore.put("헤미", 100);
		
		System.out.println(javaScore.get("양유"));
		
		javaScore.put("양유", 70); //덮어 씌운다.
		
		System.out.println(javaScore.get("양유"));
		javaScore.remove("혜미");
	}
}
