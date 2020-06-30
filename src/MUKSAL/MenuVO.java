package MUKSAL;

public class MenuVO {
	private static int menunum;
	private String category;
	private String menuname;
	private int price;
	private int ingredcode;
	private String explain;
	private int gram;

	private MenuVO(int menunum, String category, String menuname, int price, int ingredcode, String explain, int gram) {

		this.menunum = menunum;
		this.category = category;
		this.menuname = menuname;
		this.price = price;
		this.ingredcode = ingredcode;
		this.gram = gram;
	}

	private void setMenunum(int menunum) {
		this.menunum = menunum;
	}

	private void setcategory(String category) {
		this.category = category;
	}

	private void setmenuname(String menuname) {
		this.menuname = menuname;
	}

	private void setprice(int price) {
		this.price = price;
	}

	private void setIngredcode(int ingredcode) {
		this.ingredcode = ingredcode;
	}

	private void setexplain(String explain) {
		this.explain = explain;
	}

	private void setgram(int gram) {
		this.gram = gram;
	}

	public static int getMenuNum() {
		return menunum;
	}

	public String getCateGory() {
		return category;
	}

	public String getMenuName() {
		return menuname;
	}

	public int getPrice() {
		return price;
	}

	public int getIngredCode() {
		return ingredcode;
	}

	public String getExplain() {
		return explain;
	}

	public int getGram() {
		return gram;
	}

}//고객용 메뉴별VO
