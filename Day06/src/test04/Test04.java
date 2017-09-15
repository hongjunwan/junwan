package test04;

public class Test04 {
	public static void main(String[] args) {

		// String 객체의 주소를 담는 참조변수 sample 만들기
		String sample;

		// String 클래스로 객체를 생성해서 그 주소 sample에 담기
		sample = new String("Hello String test~!");

		// String 객체의 기능 중 charAt 기능은
		// 가지고있는 문자열 에서 문자 1개를 뽑아주는 기능
		char r1 = sample.charAt(1);
		
		for(int i = 0; i < sample.length(); i++) {
			System.out.println("글자 추출: " + sample.charAt(1));
		}

	}
}
