package MUKSAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CheckidDAO {

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

	public int setInsert(String id) {

		getConn();
		int cnt = 0;

		String sql = "insert into checkid values(?)";

		try {

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			cnt = psmt.executeUpdate();
			return cnt;

		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			close();

		}

		return cnt;
	}// 로그인

	public String getID(String id) {

		getConn();
		String result = "";

		String sql = "select * from check id where id = ?";

		try {

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();

			if (rs.next()) {
				 result = rs.getString(0);
			}

		} catch (

		SQLException e) {

			e.printStackTrace();
		}

		finally {
			close();

		}
		return result;

	}

	public int deleteID(String id) {

		getConn();
		int cnt = 0;

		String sql = "delete checkid where id = ?";

		try {

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			close();

		}
		return cnt;

	}// 로그인

}
