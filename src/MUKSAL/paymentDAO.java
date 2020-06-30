package MUKSAL;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class paymentDAO {

	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

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
	}// 로그인

	public ArrayList<OrderVO> Payment(String tablenum) {

		ArrayList<OrderVO> paymentlist = new ArrayList<OrderVO>();
		getConn();

		String sql = " select * from ord where id=?";

		// select TO_char(sysdate,'HH24:MI:SS') from dual;

		try {

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, tablenum);
			rs = psmt.executeQuery();

			while (rs.next()) {

				/*
				 * System.out.println( num+"\t"+rs.getString(1)+"   " +rs.getString("pw")+"   "
				 * +rs.getString(3));
				 */

				int ordernum = rs.getInt(1);
				String id = rs.getString(2);
				int people = rs.getInt(3);
				String menuname = rs.getString(4);
				int price = rs.getInt(5);
				int cnt = rs.getInt(6);
				Date orddate = rs.getDate(7);

				paymentlist.add(new OrderVO(ordernum, id, people, menuname, price, cnt, orddate));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}
		return paymentlist;
	}

	public ArrayList<OrderVO> Payment2() {

		ArrayList<OrderVO> paymentlist = new ArrayList<OrderVO>();
		getConn();

		String sql = " select * from ord";

		// select TO_char(sysdate,'HH24:MI:SS') from dual;

		try {

			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {

				/*
				 * System.out.println( num+"\t"+rs.getString(1)+"   " +rs.getString("pw")+"   "
				 * +rs.getString(3));
				 */
				int ordernum = rs.getInt(1);
				String id = rs.getString(2);
				int people = rs.getInt(3);
				String menuname = rs.getString(4);
				int price = rs.getInt(5);
				int cnt = rs.getInt(6);
				Date orddate = rs.getDate(7);

				paymentlist.add(new OrderVO(ordernum, id, people, menuname, price, cnt, orddate));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}
		return paymentlist;
	}

	public int payment_insert() {

		paymentDAO pay = new paymentDAO();
		ArrayList<OrderVO> payTOsaleslist = pay.Payment2();
		getConn();

		String sql = "insert into sales values(?,?,?,?)";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, payTOsaleslist.get(0).getOrdernum());
			System.out.println("paymentDAO  " + payTOsaleslist.get(0).getOrdDate());

			psmt.setDate(2, payTOsaleslist.get(0).getOrdDate());
			psmt.setInt(3, 1); // ★★★★★★★★★★★★★★★★★★★★★★★★★★★★
			psmt.setInt(4, payTOsaleslist.get(0).getPrice());

			System.out.println("===================================");
			System.out.println(payTOsaleslist.get(0).getOrdernum());
			System.out.println(payTOsaleslist.get(0).getOrdDate());
			System.out.println(payTOsaleslist.get(0).getMenuname());
			System.out.println(payTOsaleslist.get(0).getPrice());

			int cnt = psmt.executeUpdate();
			return cnt;

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			close();
		}
		return 0;
	}

	public int delete() {
		getConn();
		int cnt = 0;

		String sql = " delete from ord ";
		try {
			psmt = conn.prepareStatement(sql);
			cnt = psmt.executeUpdate();

			return cnt;

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

}
