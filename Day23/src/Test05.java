import java.sql.*;
 
public class Test05 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
         
        final String DB_URL = 
                            "jdbc:mysql://127.0.0.1:3306/java";
        final String DB_ID = "root";
        final String DB_PW = "sds1501";
         
        try {
            Class.forName("com.mysql.jdbc.Driver");
             
            con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
             
            String sql = "SELECT BOOK_ID,TITLE,PRICE FROM BOOKS";
             
            // pstmt�� sql ��ɾ� ���� ������� execute �Ҷ� �ȳ���.
            pstmt = con.prepareStatement(sql);
             
    // sql��ɾ select �϶��� 
    // executeUpdate:int�� �ƴ� executeQuery:ResultSet�� �����
            rs = pstmt.executeQuery(); 
             
            while(rs.next()) {
                //��ȸ��� ����.
                int bookId = rs.getInt(1);
                String title = rs.getString(2);
                int price = rs.getInt(3);
                System.out.println(bookId+"-"+title+"-"+price);
            }           
        } catch (ClassNotFoundException e) {
            System.out.println("����̹� �ε� ����");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 7. ����� �ڿ� �ݳ�
            if (rs != null) {
                try {rs.close();} catch (SQLException e) {}
            }           
            if (pstmt != null) {
                try {pstmt.close();} catch (SQLException e) {}
            }
            if (con != null) {
                try {con.close();} catch (SQLException e) {}
            }
        }
    }
}