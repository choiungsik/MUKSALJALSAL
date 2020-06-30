package MUKSAL;

import java.sql.Date;

public class OrderVO {
	   private int ordernum;
	   private String id;
	   private int people;
	   private String menuname;
	   private int price;
	   private int Cnt;
	   private int menunum;
	   private Date orddate;
	   // ÇÊµå

	   public OrderVO(int ordernum, String id, int people, String menuname, int price, int cnt, Date orddate) {
	      this.ordernum = ordernum;
	      this.id = id;
	      this.people = people;
	      this.menuname = menuname;
	      this.price = price;
	      Cnt = cnt;
	      this.orddate = orddate;
	   }
	   
	   public OrderVO(String menuname, int cnt, int price) {
		   this.menuname = menuname;
		   Cnt = cnt;
		   this.price = price;
	   }
	   
	   public int getMenunum() {
		   return menunum;
	   }
	   public void setMenunum(int menunum) {
		   this.menunum = menunum;
	   }

	   public int getOrdernum() {
	      return ordernum;
	   }

	   public void setOrdernum(int ordernum) {
	      this.ordernum = ordernum;
	   }

	   public String getId() {
	      return id;
	   }

	   public void setId(String id) {
	      this.id = id;
	   }

	   public int getPeople() {
	      return people;
	   }

	   public void setPeople(int people) {
	      this.people = people;
	   }

	   public String getMenuname() {
	      return menuname;
	   }

	   public void setMenuname(String menuname) {
	      this.menuname = menuname;
	   }

	   public int getPrice() {
	      return price;
	   }

	   public void setPrice(int price) {
	      this.price = price;
	   }

	   public int getCnt() {
	      return Cnt;
	   }

	   public void setCnt(int cnt) {
	      Cnt = cnt;
	   }

	   public Date getOrdDate() {
	      return orddate;
	   }

	   public void setDate(Date  date) {
	      this.orddate = date;
	   }

	

}

