import java.util.Scanner;
 
public class Programming6 {
    public static void main(String[] args) {
 
        int k;
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("정수 k값을 입력하시오: ");
        k = sc.nextInt();
         
        if(k == 2)
        {
            System.out.println("소수입니다.");
        }
 
        for (int i = 2; i <= k - 1; i++) {
            if (k % i == 0) {
                System.out.println("소수가 아닙니다.");
                break;
            } else if (k % i != 0 && i + 1 == k) {
                System.out.println("소수입니다.");
            }
        }
 
        System.out.println("-2~100사이의 소수 목록-");
        System.out.println("2");
 
        for (int x = 3; x <= 100; x++) {
            for (int y = 2; y <= x - 1; y++) {
                if (x % y != 0 && y + 1 == x) {
                    System.out.println(x);
                } else if (x % y == 0) {
                    break;
                }
            }
        }
 
    }
}