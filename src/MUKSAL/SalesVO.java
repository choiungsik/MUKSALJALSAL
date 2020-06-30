package MUKSAL;

import java.sql.Date;

public class SalesVO {
	private int ordernum;
	private Date orddate;
	private int price;
	private int menunum;

	public SalesVO(int ordernum, Date date, int menunum, int price) {
		this.ordernum = ordernum;
		this.orddate = date;
		this.menunum = menunum;
		this.price = price;
	}
	public SalesVO(int price) {
		
		this.price = price;
	}
	
	public SalesVO(int menunum,int price) {
		this.menunum = menunum;
		this.price = price;
	}

	

	



	public int getOrderNum() {
		return ordernum;

	}

	public void setOrdernum(int ordernum) {
		this.ordernum = ordernum;
	}



	public void setOrddate(Date orddate) {
		this.orddate = orddate;
	}



	public void setMenunum(int menunum) {
		this.menunum = menunum;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public Date getDate() {
		return orddate;
	}

	public int getMenuNum() {
		return menunum;
	}

	public int getPrice() {
		return price;
	}

}//업체용 매출VO
