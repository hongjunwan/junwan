import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

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

public class Test03 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			// 1.
			Class.forName("com.mysql.jdbc.Driver");
			// 2.
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java", "root", "sds1501");

			Scanner sc = new Scanner(System.in);

			System.out.print("����:");
			String title = sc.nextLine();
			System.out.print("���ǻ�:");
			String pub = sc.nextLine();
			System.out.print("���ǳ⵵:");
			String year = sc.nextLine();
			System.out.print("����:");
			String price = sc.nextLine();

			// 3.
			String sql = "INSERT INTO BOOKS(TITLE,PUBLISHER,PRICE,YEAR)" + "VALUES(?,?,?,?)";
			// 4.1 PreparedStatement ��ü Ȯ��
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, title);
			pstmt.setString(2, pub);
			pstmt.setString(3, price);
			pstmt.setString(4, year);
			// 5.1
			int result = pstmt.executeUpdate();

			// 6.����� Ȯ��
			System.out.println("���� ���� ���:" + result);
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 7.����� �ڿ� �ݳ�
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			}
			if (con != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			}
		}
	}
}
