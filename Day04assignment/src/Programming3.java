import java.util.Scanner;
 
public class Programming3 {
    public static void main(String[] args) {
         
        int tall;
        int weight;
        double avgweight;
         
        Scanner sc = new Scanner(System.in);
         
        System.out.print("키를 입력하시오: ");
        tall = sc.nextInt();
        System.out.print("몸무게를 입력하시오: ");
        weight = sc.nextInt();
         
        avgweight = (tall - 100) * 0.9;
         
        if(weight < avgweight){  
            System.out.println("저체중 입니다.");
        }
        else if(weight == avgweight){
            System.out.println("표준입니다.");
        }
        else{
            System.out.println("과체중 입니다.");
        }
    }
}