package oracleBank;

import java.util.List;
import java.util.Scanner;
 
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;
         
        // 키보드로 입력받을 책정보 저장 변수
        String title,pub,year;
        int price, bookNum;
         
        // DB 작업 담당할 dao 객체 생성
        BookDao dao = new BookDao(); 
         
        while(true){
            System.out.println
            ("1:책추가 2:책수정 3:책삭제 4:책번호로 검색 5:전체보기 -1:종료");
            select = sc.nextInt();
             
            if(select == -1)
                break;
             
            switch(select){
            case 1: // 책 추가작업
                sc.nextLine();
                System.out.print("제목>");
                title = sc.nextLine();
                System.out.print("출판사>");
                pub = sc.nextLine();
                System.out.print("가격>");
                price = sc.nextInt();
                 
                BookVO book = new BookVO(0, title, pub, price);
                System.out.println("추가결과:"+dao.insert(book)); // DB에 책 추가
                break;
            case 2: // 책 정보 수정
                break;
            case 3: // 책 번호 입력해서 삭제
                System.out.print("삭제할 책 번호>");
                bookNum = sc.nextInt();
                System.out.println("삭제결과:"+dao.delete(bookNum)); // DB에서 해당 번호 책 삭제
                break;
            case 4: // 책 번호로 검색
                System.out.print("검색할 책 번호>");
                bookNum = sc.nextInt();
                book = dao.selectOne(bookNum); // DB에서 책 조회
                if(book == null){
                    System.out.println("잘못된 책 번호입니다.");
                }else{
                    System.out.println(book);
                }
                break;
            case 5: // 모든 책 목록 조회
                List<BookVO> bookList = dao.selectAll();
                if(bookList.size() == 0){
                    System.out.println("books 테이블에 책이 없음");
                }else{
                    System.out.println("--책 전체목록--");
                    for(BookVO b: bookList){
                        System.out.println(b);
                    }
                    System.out.println("--목록 끝--");
                }
                break;
            }
             
        }
    }
}