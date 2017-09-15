import java.util.Scanner;
 
public class Programming4 {
    public static void main(String[] args) {
         
        int firstvalue, secondvalue, thirdvalue;
        int min;
         
        Scanner sc = new Scanner(System.in);
         
        System.out.print("3개의 정수를 입력하시오: ");
        firstvalue = sc.nextInt();
        secondvalue = sc.nextInt();
        thirdvalue = sc.nextInt();
         
        if(firstvalue < secondvalue && firstvalue < thirdvalue)
        {
            min = firstvalue;
        }
        else if(secondvalue < firstvalue && secondvalue < thirdvalue)
        {
            min = secondvalue;
        }
        else
        {
            min = thirdvalue;
        }
        System.out.println("가장 작은 값은: " + min);
    }
}