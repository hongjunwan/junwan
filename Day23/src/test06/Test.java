package test06;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
 
public class Test {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
 
        final String DB_URL = "jdbc:mysql://127.0.0.1:3306/java";
        final String DB_ID = "root";
        final String DB_PW = "sds1501";
         
        ArrayList<BookVO> bookList = new ArrayList<>();
         
        try {
            Class.forName("com.mysql.jdbc.Driver");
 
            con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
 
            String sql = 
            "SELECT BOOK_ID,TITLE,PUBLISHER,PRICE,YEAR FROM BOOKS";
 
            // pstmt�� sql ��ɾ� ���� ������� execute �Ҷ� �ȳ���.
            pstmt = con.prepareStatement(sql);
 
            // sql��ɾ select �϶���
            // executeUpdate:int�� �ƴ� executeQuery:ResultSet�� �����
            rs = pstmt.executeQuery();
 
            while (rs.next()) {
                // ��ȸ��� ����.
                int bookId = rs.getInt("BOOK_ID");
                String title = rs.getString("TITLE");
                String pub = rs.getString("PUBLISHER");
                int price = rs.getInt("PRICE");
                String year = rs.getString("YEAR");
 
                BookVO book = 
                    new BookVO(bookId, title, pub, price, year);
                bookList.add(book);
            }
             
            // DB���� ��ȸ�� å �����͵��� bookList�� �������.
            for(BookVO b: bookList) {
                System.out.println(b);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("����̹� �ε� ����");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 7. ����� �ڿ� �ݳ�
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                }
            }
        }
    }
}