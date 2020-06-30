package MUKSAL;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;




	public class OrdDAO {

	   private Connection conn = null;
	   private PreparedStatement psmt = null;
	   private ResultSet rs = null;
	   private int ordernum;
	   private String id;
	   private int people;
	   private String menuname;
	   private int price;
	   private int Cnt;
	

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
	   
	   public int order(int ordernum,String id,int people, String menuname,int price,int Cnt) {  //고객용
	      
	      getConn();
	      int cnt = 0;
	      
	      String sql="insert into ord values(?,?,?,?,?,?,sysdate)";
	      
	      
	      try {
	            psmt = conn.prepareStatement(sql);
	            psmt.setInt(1, ordernum);
	            psmt.setString(2, id);
	            psmt.setInt(3, people);
	            psmt.setString(4, menuname);
	            psmt.setInt(5, price);
	            psmt.setInt(6, Cnt);
	          cnt = psmt.executeUpdate();
	         
	         
	      } catch (SQLException e) {
	         
	         e.printStackTrace();
	      }
	      
	      
	      finally {
	         
	         close();
	      }
	      return cnt;
	      
	      
	      
	       }
	   
	   public ArrayList<OrderVO> T_CURRENT_SITUATION(int num) { //업체 테이블 현황 
	      
	      ArrayList<OrderVO> Orderlist = new ArrayList<OrderVO>();
	      getConn();
	      
	      String sql=" select  menuname,cnt,price from ord where ordernum =?";
	      
	      //select TO_char(sysdate,'HH24:MI:SS') from dual;
	      
	      try {
	         
	         psmt = conn.prepareStatement(sql);
	         psmt.setInt(1, num);
	         rs = psmt.executeQuery();
	         
	         

	         
	         while(rs.next()) {
	            
	            /*System.out.println( num+"\t"+rs.getString(1)+"   "
	                           +rs.getString("pw")+"   "
	                           +rs.getString(3));*/
	            
	            
	            String menuname= rs.getString(1);
	            int cnt =  rs.getInt(2);
	            int price = rs.getInt(3);

	            Orderlist.add(new OrderVO(menuname,cnt,price));
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	      finally {
	         close();
	         }
	      
	      return Orderlist;
	      
	      
	       }
	   
	  
	public int getMenunum(String menuname) {
		int menunum = 0;

		getConn();

		String sql = "select menunum from menu where menuname= ?";

		// select TO_char(sysdate,'HH24:MI:SS') from dual;

		try {

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, menuname);
			rs = psmt.executeQuery();

			while (rs.next()) {
				menunum = rs.getInt(1);

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			close();
		}
		return menunum;
		
	}

	public String Menuname(int menunum) {
	      
	      getConn();
	      //menunum = 1;
	      String name="";
	   
	      
	      String sql = "select menuname from menu where menunum = ?";
	   
	      
	      try { 
	         psmt = conn.prepareStatement(sql);
	         psmt.setInt(1, menunum);
	         rs = psmt.executeQuery();
	         
	         
	         
	          

	         if (rs.next()) {
	            
	            
	            name=rs.getString(1);
	      
	            
	            //Orderlist1.add(new OrderVO(rs.getString(2)));
	         }

	      } catch (SQLException e) {

	         e.printStackTrace();
	      }

	      finally {
	         close();
	      }
	      
	      
	      return name;

	   }
	}
	   
	   
	   

