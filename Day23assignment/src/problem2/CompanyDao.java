package problem2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CompanyDao {
	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/company";
	private static final String DB_ID = "root";
	private static final String DB_PW = "sds1501";

	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	ArrayList<CompanyVO> comList = new ArrayList<>();

	///////////////////////////////////////////////////
	public CompanyDao() {
		try {
			Class.forName(DB_DRIVER);
			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);

			String sql = "SELECT NAME,SALARY,PEOPLENUM,DIVISION,CEO FROM COMPANYINFO";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				CompanyVO cp = new CompanyVO();
				cp.setName(rs.getString(1));
				cp.setSalary(rs.getString(2));
				cp.setPeopleNum(rs.getInt(3));
				cp.setDivision(rs.getString(4));
				cp.setCeo(rs.getString(5));

				comList.add(cp);
			}
			for (CompanyVO c : comList) {
				System.out.println(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("jar파일 드라이버 로딩 오류");
			e.printStackTrace();
		} finally {
			closeRS();
			closePstmt();
			closeConnection();
		}
	}

	////////////////////////////////////////////////////
	public void insertCompany(CompanyVO com) {
		int result = 0;
		try {
			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);

			String sql = "INSERT INTO COMPANYINFO(NAME,SALARY,PEOPLENUM,DIVISION,CEO) VALUES(?,?,?,?,?)";

			ps = con.prepareStatement(sql);

			ps.setString(1, com.getName());
			ps.setString(2, com.getSalary());
			ps.setInt(3, com.getPeopleNum());
			ps.setString(4, com.getDivision());
			ps.setString(5, com.getCeo());

			comList.add(
					new CompanyVO(com.getName(), com.getSalary(), com.getPeopleNum(), com.getDivision(), com.getCeo())); // 갱신을

			result = ps.executeUpdate();
			System.out.println("쿼리 수행 결과(1.수행됨): + result");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closePstmt();
			closeConnection();
		}
	}

	public void updateCompany(String name, String salary, int peopleNum, String division, String ceo) {
		try {
			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
			for (int a = 0; a < comList.size(); a++) {
				if (comList.get(a).getName().equals(name)) {
					if (name.charAt(0) != '0') {
						comList.get(a).setName(name);
					}
					if (salary.charAt(0) != '0') {
						comList.get(a).setSalary(salary);
					}
					if (peopleNum != '0') {
						comList.get(a).setPeopleNum(peopleNum);
					}
					if (division.charAt(0) != '0') {
						comList.get(a).setDivision(division);
					}
					if (ceo.charAt(0) != '0') {
						comList.get(a).setCeo(ceo);
					}
					String sql = "UPDATE COMPANYINFO SET SALARY=?, PEOPLENUM=?, DIVISION=?,CEO=? WHERE NAME = ?";

					ps = con.prepareStatement(sql);

					ps.setString(1, comList.get(a).getSalary());
					ps.setInt(2, comList.get(a).getPeopleNum());
					ps.setString(3, comList.get(a).getDivision());
					ps.setString(4, comList.get(a).getCeo());
					ps.setString(5, comList.get(a).getName());

					int result = ps.executeUpdate();
					System.out.println("쿼리 수행 결과(1.수행됨): + result");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closePstmt();
			closeConnection();
		}
	}

	public void deleteCompany(String name1) {
		try {
			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
			for (int a = 0; a < comList.size(); a++) {
				if (comList.get(a).getName().equals(name1)) {
					String sql = "delete from COMPANYINFO " + "WHERE NAME = ?";
					ps = con.prepareStatement(sql);

					ps.setString(1, comList.get(a).getName());

					int result = ps.executeUpdate();
					System.out.println("쿼리 수행 결과(1.수행됨): + result");
					comList.remove(a);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closePstmt();
			closeConnection();
		}
	}
	
	public CompanyVO selectCompany(String name2) {
		CompanyVO result = null;
		try {
			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
			String sql = "SELECT NAME,SALARY,PEOPLENUM,DIVISION,CEO "
						+"FROM COMPANYINFO WHERE NAME = ?";
			
			ps = con.prepareStatement(sql);
			ps.setString(1, name2);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				result = new CompanyVO();
				result.setName(rs.getString(1));
				result.setSalary(rs.getString(2));
				result.setPeopleNum(rs.getInt(3));
				result.setDivision(rs.getString(4));
				result.setCeo(rs.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeRS();
			closePstmt();
			closeConnection();
		}
		return result;
	}

	public CompanyVO selectCompany1(String ceo1) {
		CompanyVO result = null;
		try {
			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
			String sql = "SELECT NAME,SALARY,PEOPLENUM,DIVISION,CEO "
						+"FROM COMPANYINFO WHERE CEO = ?";
			
			ps = con.prepareStatement(sql);
			ps.setString(1, ceo1);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				result = new CompanyVO();
				result.setName(rs.getString(1));
				result.setSalary(rs.getString(2));
				result.setPeopleNum(rs.getInt(3));
				result.setDivision(rs.getString(4));
				result.setCeo(rs.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeRS();
			closePstmt();
			closeConnection();
		}
		return result;
	}
	
	public void totalList() {
		for (CompanyVO c : comList) {
			System.out.println(c);
		}
	}
	//////////////////////////////////////////////////////////
	public void closeConnection() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void closePstmt() {
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void closeRS() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
