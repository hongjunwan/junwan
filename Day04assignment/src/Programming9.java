import java.util.Scanner;
 
public class Programming9 {
    public static void main(String[] args) {
 
        String operator;
        char operatorvalue;
        int value1, value2, result = 0;
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("���� ��ȣ ���ڸ� �Է��Ͻÿ�: ");
        operator = sc.next();
        operatorvalue = operator.charAt(0);
        System.out.print("2���� ������ �Է��Ͻÿ�: ");
        value1 = sc.nextInt();
        value2 = sc.nextInt();
 
        if (operatorvalue == '+') {
            result = value1 + value2;
        } 
        else if (operatorvalue == '-') {
            result = value1 - value2;
        } 
        else if (operatorvalue == '*') {
            result = value1 * value2;
        } 
        else if (operatorvalue == '/'){
            if (value2 == 0) {
                System.out.println("Incorrect");
            } 
            else {
                result = value1 / value2;
                }
        } 
        else {
            System.out.println("���� �߸� �Է�");
        }
        System.out.println("���: " + result);
    }
}