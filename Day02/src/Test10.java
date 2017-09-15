// 프로그램이 종료될 때까지 변경하지 않을 값은 상수 처리함.
// 변수말고 왜 상수 ? 오류방지하려고
 
// 상수 사용 장점
// 1. 숫자대신 이름 붙혀놔서 용도를 알아보기 쉬움.
// 2. 확장성.
public class Test10 {
    public static void main(String[] args) {
        final int STUDENT_COUNT = 30;
        int i = 100;
         
        i = 200;
        System.out.println(i);
        System.out.println(STUDENT_COUNT);   
    }
}
