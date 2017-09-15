import java.util.Scanner;
 
public class Programming5 {
    public static void main(String[] args) {
         
        int x;
        double result;
         
        Scanner sc = new Scanner(System.in);
         
        System.out.print("x값을 입력하시오: ");
        x = sc.nextInt();
         
        if(x <= 0){
            result = (x*x*x) - (9*x) + 2;
        }
        else{
            result = (7*x) + 2;
        }
         
        System.out.println("f(x)= " + result);
    }
}