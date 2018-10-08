package tienda;

public class dates {

	private String mail;
	private String user;
	private String password;
	
	public dates(String mail, String user, String password) {
	
		this.mail = mail;
		this.user = user;
		this.password = password;
	}
	

	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static void main(String[] args) {
	
	}

}
