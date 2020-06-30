package MUKSAL;


public class IngredientVO {

	private String menuname;
	private String menuname1;
	private String menuname2;
	private String menuname3;
	private String menuname4;
	private String menuname5;
	private String menuname6;
	private int ingredcode;

	private String explain;

	public IngredientVO(String menuname, String menuname1, String menuname2, String menuname3, String menuname4,
			String menuname5, String menuname6, int ingredcode, String explain) {
		this.menuname = menuname;
		this.menuname1 = menuname1;
		this.menuname2 = menuname2;
		this.menuname3 = menuname3;
		this.menuname4 = menuname4;
		this.menuname5 = menuname5;
		this.menuname6 = menuname6;
		this.ingredcode = ingredcode;

		this.explain = explain;

	}

	public IngredientVO(int ingredcode, String menuname1, String menuname2, String menuname3, String menuname4,
			String menuname5, String menuname6) {
		this.ingredcode = ingredcode;
		this.menuname1 = menuname1;
		this.menuname2 = menuname2;
		this.menuname3 = menuname3;
		this.menuname4 = menuname4;
		this.menuname5 = menuname5;
		this.menuname6 = menuname6;
	}

	public IngredientVO(String menuname, String explain) {
		this.menuname = menuname;
		this.explain = explain;
	}

	public String getMenuname() {
		return menuname;
	}

	public String getMenuname1() {
		return menuname1;
	}

	public String getMenuname2() {
		return menuname2;
	}

	public String getMenuname3() {
		return menuname3;
	}

	public String getMenuname4() {
		return menuname4;
	}

	public String getMenuname5() {
		return menuname5;
	}

	public String getMenuname6() {
		return menuname6;
	}

	public int getIngredcode() {
		return ingredcode;
	}

	public String getExplain() {
		return explain;
	}

}
