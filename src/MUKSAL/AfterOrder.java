package MUKSAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AfterOrder {

	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;
	private String id;
	private int price;
	private int Cnt;
	private String menuname;

	public void getConn() {

		String url = "jdbc:oracle:thin:@192.168.0.5:1521:xe";
		String user = "Muksal";
		String password = "123";

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();

		}
	}// ¿¬°á

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

	public ArrayList<AftOrderVO> AfterOrd(String id) {

		ArrayList<AftOrderVO> Afterordlist = new ArrayList<AftOrderVO>();
		getConn();
		String sql = " select menuname, price, cnt from ord where id =?";

		try {

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();

			while (rs.next()) {

				/*
				 * System.out.println( num+"\t"+rs.getString(1)+"   " +rs.getString("pw")+"   "
				 * +rs.getString(3));
				 */

				menuname = rs.getString(1);
				price = rs.getInt(2);
				Cnt = rs.getInt(3);

				Afterordlist.add(new AftOrderVO(menuname, price, Cnt));

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			close();
		}

		return Afterordlist;

	}

}
