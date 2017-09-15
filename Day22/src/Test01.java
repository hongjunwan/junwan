import java.lang.Thread.State;
import java.sql.*;

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

public class Test01 {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java", "root", "sds1501");
			//3.
			String sql = "INSERT INTO BOOKS(TITLE,PUBLISHER,PRICE,YEAR)" + "VALUES('�ڹٶ� �����ΰ�','�������ǻ�',33123,2015)";
			//4.
			stmt = con.createStatement();
			//5.1
			int result = stmt.executeUpdate(sql);
			
			//6.����� Ȯ��
			System.out.println("���� ���� ���:"+result);
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//7.����� �ڿ� �ݳ�
			if(stmt != null) {
				try {stmt.close();} catch(SQLException e) {}
			}
			if(con != null) {
				try {stmt.close();} catch(SQLException e) {}
			}
		}
	}
}
