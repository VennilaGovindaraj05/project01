package DesingPattern;

class program
{
	private String name;
	private int id;
	private String email;
	private long mobileNum;
	
   public 	program()
	{
		
	}
	
	public program(String name,int id,String email,long mobilephn)
	{
		this.name=name;
		this.id=id;
		this.email=email;
		this.mobileNum=mobileNum;
	}
	

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", email=" + email + ", mobileNum=" + mobileNum + "]";
	}
	
	
	//inner static class
	
   static class UserDetail
   {
	   private String name;
		private int id;
		private String email;
		private long mobileNum;
	   
	  public UserDetail name(String name)
	  {
		  this.name=name;
		  return this;
		  
	  }
	   
	  
	  public UserDetail id(int id)
	  {
		  this.id=id;
		  return this;
		  
	  }
	  
	  
	  public UserDetail email(String email)
	  {
		  this.email=email;
		  return this;
		  
	  }
	  
	  
	  public UserDetail name(long mobileNum)
	  {
		  this.mobileNum=mobileNum;
		  return this;
		  
	  }
	  
	  public program build()
	  { 
		  program user=new program(this.name,this.id,this.email,this.mobileNum);
		  return user;
	  }
	  
   }
	
	
}


public class Builderdesingpattern3 
{

	public static void main(String[] args) 
	{
		program.UserDetail userdetail=new program.UserDetail();
	    program user=userdetail.id(12).name("sri").email("fygwf").build();
	    System.out.println(user);
				   
		   

	}

}
