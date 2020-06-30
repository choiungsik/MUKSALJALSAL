package MUKSAL;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SalesDAO {

	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;
	private String orddate;
	private int menunum;
	private int price;

	public void getConn() {

		String url = "jdbc:oracle:thin:@192.168.0.5:1521:xe";
		String user = "muksal";
		String password = "123";

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();

		}
	}// 연결

	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}

			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}// close

	public boolean login(String id, String pw) {

		getConn();

		String sql = "select * from member where id=? and pw=? ";

		try {

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();

			if (rs.next()) {
				return true;

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			close();

		}

		return false;
	}

	// 정산
	public ArrayList<SalesVO> Calculate(Date orddate) {

		ArrayList<SalesVO> SalesList = new ArrayList<SalesVO>();
		getConn();
		String sql = "select menunum, price from sales where orddate = ?";
		try {

			psmt = conn.prepareStatement(sql);
			psmt.setDate(1, orddate);
			rs = psmt.executeQuery();

			while (rs.next()) {

				menunum= rs.getInt(1);
				price = rs.getInt(2);

//			MemberVO vo = new MemberVO(id, pw, nickname);
//			list.add(vo);
				SalesList.add(new SalesVO(menunum, price));

			}

		} catch (SQLException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();

		}
		return SalesList;

	}// 정산용 DAO

	public ArrayList<SalesVO> CalculateFinal() {

		ArrayList<SalesVO> SalesList = new ArrayList<SalesVO>();
		getConn();
		String sql = "select price from sales";
		try {

			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {

				price = rs.getInt(1);

//			MemberVO vo = new MemberVO(id, pw, nickname);
//			list.add(vo);
				SalesList.add(new SalesVO(price));

			}

		} catch (SQLException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();

		}
		return SalesList;

	}// 정산용 DAO

}
