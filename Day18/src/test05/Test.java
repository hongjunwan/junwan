package test05;

import java.util.HashMap;

public class Test {
	public static void main(String[] args) {
		HashMap<String, Integer> javaScore = new HashMap<>();
		
		javaScore.put("����", 30);
		javaScore.put("�浿", 45);
		javaScore.put("���", 100);
		
		System.out.println(javaScore.get("����"));
		
		javaScore.put("����", 70); //���� �����.
		
		System.out.println(javaScore.get("����"));
		javaScore.remove("����");
	}
}
