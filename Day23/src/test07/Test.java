package test07;
 
import java.util.List;
import java.util.Scanner;
 
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookVO book = null;
        BookDao dao = new BookDao();
         
        while(true) {
            System.out.println
                ("--�޴��� �ϳ��� �����ϼ���.--");
            System.out.println
                ("1:å�߰� 2:å�˻� 3:å��Ϻ��� -1:����");
            System.out.print
                ("select>>");
            int select = sc.nextInt();
             
            if(select == -1) // -1 ����
                break;
             
            switch(select) {
            case 1:// å �߰�
                sc.nextLine(); // ��ĳ�� ���׶����� �ǹ̾��� �߰�
                book = new BookVO();
                System.out.print("����:");
                book.setTitle(sc.nextLine());
                System.out.print("���ǻ�:");
                book.setPublisher(sc.nextLine());
                System.out.print("���ǳ⵵:");
                book.setYear(sc.nextLine());
                System.out.print("����:");
                book.setPrice(sc.nextInt());
                 
                System.out.println
                ("å�߰� ���:"+ dao.insertBook(book));
                break;
            case 2:// å �˻�
                System.out.print("�˻��� å ��ȣ:");
                int inputNum = sc.nextInt();
                 
                System.out.println
                ("�˻����:" + dao.selectBook(inputNum));
                break;
            case 3:// å ��Ϻ���
            	 List<BookVO> bookList = dao.selectBookList();
                 System.out.println("-- ��� ����--");
                 for(BookVO b: bookList) {
                     System.out.println(b);
                 }
                 System.out.println("-- ��� ��--");
                 break;
            }
        }// end while
        System.out.println("å ���� ���α׷��� �����մϴ�.bye");     
    }
}