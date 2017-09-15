package test01;

public class Test01 {
	public static void main(String[] args) {
		
		// 자바 라이브러리의 String이라는 클래스(설계도)를 이용해
		// 객체를 생성하는 문장
		
		String msg  = new String("Hello Java Class~!!");
		
		//msg로 객체에 접근해서
		//result1에 담아오기
	
		String result1 = msg.toUpperCase(); //toUpperCase 다 대문자로 바꾸는
		
		//어떤 결과였는지 결과화면에 출력해서 확인하기
		System.out.println(result1);
		
		//위에서 생성한 객체에 다시 접근해서 replace기능 테스트하기
		//H를 T로 바꿈
		String result2 = msg.replace('H','T');
		System.out.println(result2);
	}
}
