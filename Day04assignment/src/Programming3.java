import java.util.Scanner;
 
public class Programming3 {
    public static void main(String[] args) {
         
        int tall;
        int weight;
        double avgweight;
         
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Ű�� �Է��Ͻÿ�: ");
        tall = sc.nextInt();
        System.out.print("�����Ը� �Է��Ͻÿ�: ");
        weight = sc.nextInt();
         
        avgweight = (tall - 100) * 0.9;
         
        if(weight < avgweight){  
            System.out.println("��ü�� �Դϴ�.");
        }
        else if(weight == avgweight){
            System.out.println("ǥ���Դϴ�.");
        }
        else{
            System.out.println("��ü�� �Դϴ�.");
        }
    }
}