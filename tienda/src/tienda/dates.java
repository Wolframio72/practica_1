package tienda;

public class dates {

	
	static String mail;
	static String name;
	private String password;
	
	public dates(String mail, String name, String password) {
	
		this.mail = mail;
		this.name = name;
		this.password = password;
	}
	

	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
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
