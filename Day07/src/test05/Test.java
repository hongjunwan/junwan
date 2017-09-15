package test05;

public class Test {
	public static void main(String[] args) {
		int size = 5;

		int[] numbers = new int[size];
		
		//배열에 10부터 50까지 채우고 싶어서 아래와 같이
		// 반복문을 작성한 경우 배열 인덱스 i 값이
        // 1부터 5까지 사용됨. 에러남. ArrayIndexOutOfBounds

		for (int i = 1; i <= size; i++) {
			numbers[i] = (i * 10);
		}
	}
}
