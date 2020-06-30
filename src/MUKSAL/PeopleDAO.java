package MUKSAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PeopleDAO {

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

	public int setInsert(int people1, int people2, String id) {

		getConn();
		int cnt = 0;

		String sql = "insert into people values(?,?,?)";

		try {

			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, people1);
			psmt.setInt(2, people2);
			psmt.setString(3, id);

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

	public int[][] getPeople(String id) {

		getConn();
		int[][] cnt = new int[6][2];
		int i = 0;
		String sql = "select * from people where id = ?";

		try {

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();

			if (rs.next()) {
				if(id.endsWith("1")) {
					i = 0;
				}else if(id.endsWith("2")) {
					i=1;
				}else if(id.endsWith("3")) {
					i=2;
				}else if(id.endsWith("4")) {
					i=3;
				}else if(id.endsWith("5")) {
					i=4;
				}else if(id.endsWith("6")) {
					i=5;
				}
				cnt[i][0] = rs.getInt(1);
				cnt[i][1] = rs.getInt(2);
				return cnt;
			}

		}catch(

	SQLException e)
	{

		e.printStackTrace();
	}

	finally
	{
		close();

	}return cnt;

	}// 로그인

	public int getPeople2(String id) {

		getConn();
		int[][] cnt = new int[6][2];
		int i = 0;
		int j = 0;
		String sql = "select * from people where id = ?";

		try {

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();

			if (rs.next()) {
				if(id.endsWith("1")) {
					i = 0;
				}else if(id.endsWith("2")) {
					i=1;
				}else if(id.endsWith("3")) {
					i=2;
				}else if(id.endsWith("4")) {
					i=3;
				}else if(id.endsWith("5")) {
					i=4;
				}else if(id.endsWith("6")) {
					i=5;
				}
				cnt[i][0] = rs.getInt(1);
				cnt[i][1] = rs.getInt(2);
				
				j+= rs.getInt(1)+rs.getInt(2);
				
				return j;
			}

		}catch(

	SQLException e)
	{

		e.printStackTrace();
	}

	finally
	{
		close();

	}return j;

	}// 로그인

	public int deletePeople(String id) {

		getConn();
		int cnt = 0 ;

		String sql = "delete people where id = ?";

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
