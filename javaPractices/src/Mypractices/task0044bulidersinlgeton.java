package Mypractices;


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

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
	static class UserDetails
	{
		
		private int id;
		private String name;
		private String password;
		
		 
		  public UserDetails id(int id)
		  {
			  this.id=id;
			  return this;
			  
		  }
		
		   
		  public UserDetails name (String name)
		  {
			  this.name=name;
			  return this;
			  
		  }
		   
		   
		  public UserDetails password(String password)
		  {
			  this.password=password;
			  return this;
			  
		  }
		  public User build()
		  { 
			  User user=new User(this.id,this.name,this.password);
			  return user;
		  }
		  	   
	}

	
}

