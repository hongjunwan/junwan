import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//[데이터베이스 자바 프로그래밍 매뉴얼]
//1. 드라이버 로딩
//2. 커넥션 생성
//3. sql 명령어 작성
//4. Statement 또는 PreparedStatement 객체 확보
// 4.1 Statement 쓰는 경우
// 4.2 PreparedStatement 쓰는 경우
//5. 명령어 실행
// 5.1 insert, update, delete 명령어일 때
// 5.2 select 명령어일 때
//6. 결과값 확인 및 가공
//7. 사용한 자원 close 

public class Test02 {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;

		try {
			//1.
			Class.forName("com.mysql.jdbc.Driver");
			//2.
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java", "root", "sds1501");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("제목:");
			String title = sc.nextLine();
			System.out.print("출판사:");
			String pub = sc.nextLine();
			System.out.print("출판년도:");
			String year = sc.nextLine();
			System.out.print("가격:");
			String price = sc.nextLine();
			
			//3.
			String sql = "INSERT INTO BOOKS(TITLE,PUBLISHER,PRICE,YEAR)" + "VALUES('"+title+"','"+pub+"',"+price+","+year+")";
			//4.
			stmt = con.createStatement();
			//5.1
			int result = stmt.executeUpdate(sql);
			
			//6.결과값 확인
			System.out.println("쿼리 수행 결과:"+result);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 오류");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//7.사용한 자원 반납
			if(stmt != null) {
				try {stmt.close();} catch(SQLException e) {}
			}
			if(con != null) {
				try {stmt.close();} catch(SQLException e) {}
			}
		}
	}
}
