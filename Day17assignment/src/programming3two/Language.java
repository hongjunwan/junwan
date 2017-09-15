package programming3two;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Language {
	private String[] textArray;

	public void arraySort() {
		textArray = new String[] {"the","grass","is","greener","on","the","other","side",
				"of","the","fence"};
		
		Arrays.sort(textArray);
		
		for (int x = 0; x < textArray.length; x++) {
			System.out.println(textArray[x]);
		}
	}
}
