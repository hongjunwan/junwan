package test07;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
 
// �����ͺ��̽� BOOKS ���̺� ���� �۾��� �����ϴ� Ŭ����
public class BookDao {
    private static final String DB_DRIVER = 
                        "com.mysql.jdbc.Driver";
    private static final String DB_URL = 
                        "jdbc:mysql://127.0.0.1:3306/java";
    private static final String DB_ID = "root";
    private static final String DB_PW = "sds1501";
     
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;
////////////////////////////////////////////////////////////
    public BookDao() {
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("jar���� ����̹� �ε� ����");
            e.printStackTrace();
        }
    }
////////////////////////////////////////////////////////////
    public int insertBook(BookVO book) {
        int result = 0;
        try {
            con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
            String sql = 
                "INSERT INTO BOOKS(TITLE,PUBLISHER,PRICE,YEAR)"
                +"VALUES(?,?,?,?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, book.getTitle());
            pstmt.setString(2, book.getPublisher());
            pstmt.setInt(3, book.getPrice());
            pstmt.setString(4, book.getYear());
             
            result = pstmt.executeUpdate(); // SQL ����
        } catch (SQLException e) {
            System.out.println("insertBook����");
            e.printStackTrace();
        } finally {
            closePstmt();
            closeConnection();
        }       
        return result;
    }
     
    public BookVO selectBook(int bookId) {
        BookVO result = null;
        try {
            con = DriverManager.getConnection
                                    (DB_URL, DB_ID, DB_PW);
            String sql = 
                    "SELECT BOOK_ID,TITLE,PUBLISHER,YEAR,PRICE "
                    +"FROM BOOKS WHERE BOOK_ID=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, bookId);
            rs = pstmt.executeQuery(); // SQL ����
             
            if(rs.next()) {
                result = new BookVO();
                result.setBookId(rs.getInt(1));
                result.setTitle(rs.getString(2));
                result.setPublisher(rs.getString(3));
                result.setYear(rs.getString(4));
                result.setPrice(rs.getInt(5));
            }           
        } catch (SQLException e) {
            System.out.println("selectBook ����");
            e.printStackTrace();
        } finally {
            closeRS();
            closePstmt();
            closeConnection();
        }
         
        return result;
    }
     
    public List<BookVO> selectBookList(){
        ArrayList<BookVO> bookList = new ArrayList<>();
         
        try {
            con = DriverManager.getConnection
                                    (DB_URL, DB_ID, DB_PW);
            String sql = 
                    "SELECT BOOK_ID,TITLE,PUBLISHER,YEAR,PRICE "
                    +"FROM BOOKS ORDER BY PRICE ASC";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery(); // SQL ����
             
            while(rs.next()) {
                BookVO book = new BookVO();
                book.setBookId(rs.getInt(1));
                book.setTitle(rs.getString(2));
                book.setPublisher(rs.getString(3));
                book.setYear(rs.getString(4));
                book.setPrice(rs.getInt(5));
                 
                bookList.add(book);
            }           
        } catch (SQLException e) {
            System.out.println("selectBook ����");
            e.printStackTrace();
        } finally {
            closeRS();
            closePstmt();
            closeConnection();
        }
        return bookList;
    }
     
//////////////////////////////////////////////////////////
    public void closeConnection() {
        if(con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
     
    public void closePstmt() {
        if(pstmt != null) {
            try {
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
     
    public void closeRS() {
        if(rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
     
}