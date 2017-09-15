import java.util.Scanner;
 
public class Programming10 {
    public static void main(String[] args) {
        long a = 0, b = 1, c;
        int x;
        int i;
         
        Scanner sc = new Scanner(System.in);
         
        System.out.print("몇 번째 항까지 출력하시겠습니까? ");
        x = sc.nextInt();
         
        System.out.print(a + "," + b );
         
        for(i = 2; i <= x; i++)
        {
            c = a + b;
            a = b;
            b = c;
            System.out.print("," + c);
        }
    }
}