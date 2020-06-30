package MUKSAL;

public class LoginVO {

	
	private String id;
	private String pw;
	private String nickname;

	// 필드 초기화 시키기 위해서!
	public LoginVO(String id, String pw, String nickname) {
	
		this.id = id;
		this.pw = pw;
		this.nickname = nickname;
	}
	


	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getNickname() {
		return nickname;
	}

}
