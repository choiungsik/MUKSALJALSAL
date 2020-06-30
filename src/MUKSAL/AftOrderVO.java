package MUKSAL;

public class AftOrderVO {

	private String menuname;
	private int price;
	private int Cnt;
	// ÇÊµå

	public AftOrderVO(String menuname, int price, int cnt) {
		super();
		this.menuname = menuname;
		this.price = price;
		Cnt = cnt;
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

}