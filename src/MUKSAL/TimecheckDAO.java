package MUKSAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TimecheckDAO {

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

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

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

	}

	public int timeCheck(int num) {

		getConn();
		getConn();
		int cnt = 0;
		String sql = "insert into timecheck values(?)";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, num);
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {

			close();
		}
		return cnt;

	}

	public int timeCheckSelect() {

		getConn();
		int cnt = 0;
		String sql = "select* from timecheck";

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			if (rs.next()) {
				cnt = rs.getInt(1);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {

			close();
		}
		return cnt;

	}

	public int timeCheckDelete() {

		getConn();
		int cnt = 0;
		String sql = "delete from timecheck";

		try {
			psmt = conn.prepareStatement(sql);
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {

			close();
		}
		return cnt;

	}

}
