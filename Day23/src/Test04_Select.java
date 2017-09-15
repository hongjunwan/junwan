import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
//[�����ͺ��̽� �ڹ� ���α׷��� �Ŵ���]
//1. ����̹� �ε�
//2. Ŀ�ؼ� ����
//3. sql ��ɾ� �ۼ�
//4. Statement �Ǵ� PreparedStatement ��ü Ȯ��
// 4.1 Statement ���� ���
// 4.2 PreparedStatement ���� ���
//5. ��ɾ� ����
// 5.1 insert, update, delete ��ɾ��� ��
// 5.2 select ��ɾ��� ��
//6. ����� Ȯ�� �� ����
//7. ����� �ڿ� close 
public class Test04_Select {
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
             
            String sql = "SELECT BOOK_ID,TITLE,PRICE "
                        + "FROM BOOKS WHERE BOOK_ID=103";
             
            // pstmt�� sql ��ɾ� ���� ������� execute �Ҷ� �ȳ���.
            pstmt = con.prepareStatement(sql);
             
    // sql��ɾ select �϶��� 
    // executeUpdate:int�� �ƴ� executeQuery:ResultSet�� �����
            rs = pstmt.executeQuery(); 
             
            if(rs.next()==true) {
                //��ȸ��� ����.
                int bookId = rs.getInt(1);
                String title = rs.getString(2);
                int price = rs.getInt(3);
                System.out.println(bookId+"-"+title+"-"+price);
            }else {
                //��ȸ��� ����.
                System.out.println("select ��ȸ ��� ����");
            }
             
             
        } catch (ClassNotFoundException e) {
            System.out.println("����̹� �ε� ����");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}