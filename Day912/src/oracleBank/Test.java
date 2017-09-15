package oracleBank;

import java.util.List;
import java.util.Scanner;
 
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;
         
        // Ű����� �Է¹��� å���� ���� ����
        String title,pub,year;
        int price, bookNum;
         
        // DB �۾� ����� dao ��ü ����
        BookDao dao = new BookDao(); 
         
        while(true){
            System.out.println
            ("1:å�߰� 2:å���� 3:å���� 4:å��ȣ�� �˻� 5:��ü���� -1:����");
            select = sc.nextInt();
             
            if(select == -1)
                break;
             
            switch(select){
            case 1: // å �߰��۾�
                sc.nextLine();
                System.out.print("����>");
                title = sc.nextLine();
                System.out.print("���ǻ�>");
                pub = sc.nextLine();
                System.out.print("����>");
                price = sc.nextInt();
                 
                BookVO book = new BookVO(0, title, pub, price);
                System.out.println("�߰����:"+dao.insert(book)); // DB�� å �߰�
                break;
            case 2: // å ���� ����
                break;
            case 3: // å ��ȣ �Է��ؼ� ����
                System.out.print("������ å ��ȣ>");
                bookNum = sc.nextInt();
                System.out.println("�������:"+dao.delete(bookNum)); // DB���� �ش� ��ȣ å ����
                break;
            case 4: // å ��ȣ�� �˻�
                System.out.print("�˻��� å ��ȣ>");
                bookNum = sc.nextInt();
                book = dao.selectOne(bookNum); // DB���� å ��ȸ
                if(book == null){
                    System.out.println("�߸��� å ��ȣ�Դϴ�.");
                }else{
                    System.out.println(book);
                }
                break;
            case 5: // ��� å ��� ��ȸ
                List<BookVO> bookList = dao.selectAll();
                if(bookList.size() == 0){
                    System.out.println("books ���̺� å�� ����");
                }else{
                    System.out.println("--å ��ü���--");
                    for(BookVO b: bookList){
                        System.out.println(b);
                    }
                    System.out.println("--��� ��--");
                }
                break;
            }
             
        }
    }
}