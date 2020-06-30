package MUKSAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class IngredientDAO {
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

	public ArrayList<IngredientVO> ingred(int code1) {
		ArrayList<IngredientVO> list = new ArrayList<IngredientVO>();
		getConn();
		String sql = "select * from ingredients where ingredcode= ? ";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, code1);

			rs = psmt.executeQuery();

			while (rs.next()) {
				int ingredcode = rs.getInt(1);
				String menuname1 = rs.getString(3);
				String menuname2 = rs.getString(4);
				String menuname3 = rs.getString(5);
				String menuname4 = rs.getString(6);
				String menuname5 = rs.getString(7);
				String menuname6 = rs.getString(8);

				list.add(
						new IngredientVO(ingredcode, menuname1, menuname2, menuname3, menuname4, menuname5, menuname6));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}
}
