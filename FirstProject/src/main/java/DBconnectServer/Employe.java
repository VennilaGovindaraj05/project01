package DBconnectServer;

public class Employe
{
	private String name;	
	private String gender;
	private  String password;
	private String email;
	
	public Employe(String name, String gender, String password, String email) {
		super();
		this.name = name;
		this.gender = gender;
		this.password = password;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employe [name=" + name + ", gender=" + gender + ", password=" + password + ", email="
				+ email + "]";
	}
	
	
	

}
