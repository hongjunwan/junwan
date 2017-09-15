import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

class Member {
	private String id;
	private String pw;
	private String eMail;
	private String name;
	private String pn;

	public Member(String id, String pw, String eMail, String name, String pn) {
		this.id = id;
		this.pw = pw;
		this.eMail = eMail;
		this.name = name;
		this.pn = pn;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", eMail=" + eMail + ", name=" + name + ", pn=" + pn + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPn() {
		return pn;
	}

	public void setPn(String pn) {
		this.pn = pn;
	}
}

public class Programming {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<Member> member = new ArrayList<>();

		// 1
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/member", "root", "sds1501");
			Scanner sc = new Scanner(System.in);

			String sql = "SELECT ID,PASSWORD,EMAIL,NAME,PHONE FROM MEMBER";
			ps = con.prepareStatement(sql);

			rs = ps.executeQuery();

			while (rs.next()) {
				// 조회결과 있음.
				String id = rs.getString("ID");
				String pw = rs.getString("PASSWORD");
				String eMail = rs.getString("EMAIL");
				String name = rs.getString("NAME");
				String pn = rs.getString("PHONE");

				Member m = new Member(id, pw, eMail, name, pn);
				member.add(m);
			}
			for (Member b : member) {
				System.out.println(b);
			}

			while (true) {
				System.out.print("(1.추가 2.갱신 3.삭제 -1.종료)원하는 업무를 선택하세요: ");
				int x = sc.nextInt();

				if (x == -1) {
					System.out.println("종료되었습니다.");
					break;
				}

				switch (x) {
				case 1:
					System.out.print("ID:");
					String id1 = sc.next();
					System.out.print("PW:");
					String pw1 = sc.next();
					System.out.print("EMAIL:");
					String eMail1 = sc.next();
					System.out.print("NAME:");
					String name1 = sc.next();
					System.out.print("PHONE NUMBER:");
					String pn1 = sc.next();

					member.add(new Member(id1, pw1, eMail1, name1, pn1)); // 갱신을 하기 위해 복사

					System.out.print("\n등록 하시겠습니까?(Y or N):");
					String text = sc.next();

					if (text.charAt(0) == 'Y') {
						String sql1 = "INSERT INTO MEMBER(ID,PASSWORD,EMAIL,NAME,PHONE)" + "VALUES(?,?,?,?,?)";

						ps = con.prepareStatement(sql1);

						ps.setString(1, id1);
						ps.setString(2, pw1);
						ps.setString(3, eMail1);
						ps.setString(4, name1);
						ps.setString(5, pn1);

						int result = ps.executeUpdate();

						System.out.println("쿼리 수행 결과(1.수행됨): + result");
					} else {
						System.out.println("취소되었습니다.");
					}
					break;
				case 2:
					System.out.print("갱신 할 ID(키 값):");
					String id2 = sc.next();
					for (int a = 0; a < member.size(); a++) {
						if (member.get(a).getId().equals(id2)) {
							System.out.print("PW(0:갱신 안함):");
							String pw2 = sc.next();
							if (pw2.charAt(0) != '0') {
								member.get(a).setPw(pw2);
							}

							System.out.print("EMAIL(0:갱신 안함):");
							String eMail2 = sc.next();
							if (eMail2.charAt(0) != '0') {
								member.get(a).seteMail(eMail2);
							}

							System.out.print("NAME(0:갱신 안함):");
							String name2 = sc.next();
							if (name2.charAt(0) != '0') {
								member.get(a).setName(name2);
							}

							System.out.print("PHONE NUMBER(0:갱신 안함):");
							String pn2 = sc.next();
							if (pn2.charAt(0) != '0') {
								member.get(a).setPn(pn2);
							}

							String sql2 = "UPDATE MEMBER SET PASSWORD=?,EMAIL=?,NAME=?,PHONE=?" + "WHERE ID = ?";
							ps = con.prepareStatement(sql2);

							ps.setString(1, member.get(a).getPw());
							ps.setString(2, member.get(a).geteMail());
							ps.setString(3, member.get(a).getName());
							ps.setString(4, member.get(a).getPn());
							ps.setString(5, member.get(a).getId());

							int result = ps.executeUpdate();
							System.out.println("쿼리 수행 결과(1.수행됨): + result");
						}
					}
					break;
				case 3:
					System.out.print("삭제 할 ID(키 값):");
					String id3 = sc.next();
					for (int a = 0; a < member.size(); a++) {
						if (member.get(a).getId().equals(id3)) {
							String sql3 = "delete from MEMBER " + "WHERE ID = ?";
							ps = con.prepareStatement(sql3);

							ps.setString(1, member.get(a).getId());

							int result = ps.executeUpdate();
							System.out.println("쿼리 수행 결과(1.수행됨): + result");
							member.remove(a);
						}
					}
					break;
				}
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 오류");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 7. 사용한 자원 반납
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
				}
			}
			if (ps != null) {
				try {
					ps.close();
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
