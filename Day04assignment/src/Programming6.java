import java.util.Scanner;
 
public class Programming6 {
    public static void main(String[] args) {
 
        int k;
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("���� k���� �Է��Ͻÿ�: ");
        k = sc.nextInt();
         
        if(k == 2)
        {
            System.out.println("�Ҽ��Դϴ�.");
        }
 
        for (int i = 2; i <= k - 1; i++) {
            if (k % i == 0) {
                System.out.println("�Ҽ��� �ƴմϴ�.");
                break;
            } else if (k % i != 0 && i + 1 == k) {
                System.out.println("�Ҽ��Դϴ�.");
            }
        }
 
        System.out.println("-2~100������ �Ҽ� ���-");
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