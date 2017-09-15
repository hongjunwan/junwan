package programming3;

import java.util.StringTokenizer;

public class Language {
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int wordNumber() {
		int count = 0;
		StringTokenizer st = new StringTokenizer(text); // �ڹ�.��ƿ������

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			count++;
		}
		return count;
	}
}
