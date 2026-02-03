package DesingPattern;


/**
 * 
 */
class User
{
	
	private int id;
	private String name;
	private String password;
	
	public User(int id, String name, String password)
	{
		this.id=id;
		this.name=name;
		this.password=password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + 
				", name=" + name + 
				", password=" +
				password + "]";
	}
	
	
	
	
}





public class singletondesingpattern {

	public static void main(String[] args)
	{
		 User user1=new User(1,"jansi", "ABCDEF12");
		
		 singletonUser2 user2 =new singletonUser2(12,"run","defgi677");
		 
		 ConnectionSingleton conn =ConnectionSingleton.getInstances();
		 conn.connection(user1);
		 conn.connection(user2);
		
		
		 
		  
	}

}
