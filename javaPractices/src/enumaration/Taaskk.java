package enumaration;


import java.util.Arrays;
import java.util.Scanner;

/*enum Roles
{
	SUPERADMIN(Operations.READ,Operations.WRITE,Operations.UPDATE,Operations.DELETE),
	ADMIN(Operations.READ,Operations.WRITE,Operations.UPDATE,Operations.DELETE),
	MANAGER(Operations.WRITE,Operations.READ,Operations.UPDATE),
	STAFF(Operations.READ,Operations.UPDATE),
	USER(Operations.READ);
	
    private Operations[] operation;
	Roles(Operations ...operation)
	{
		this.operation=operation;
	}

   public Operations[] getOperations()
   {
	   return this.operation;
   }

}

	enum Operations
	{
		READ,
		WRITE,
		UPDATE,
		DELETE;
		
	}


public class Taaskk 
{
   public static void main(String[] args)
  {
	
	   String role="user";
	   Roles r=Roles.valueOf(role.toUpperCase());
	   switch(r)
	   {
	   case SUPERADMIN:
		   System.out.println(Arrays.toString(Roles.SUPERADMIN.getOperations()));
	   break;
	   
	   case ADMIN:
		   System.out.println(Arrays.toString(Roles.ADMIN.getOperations()));
	   break;
	  
	   case MANAGER:
		   System.out.println(Arrays.toString(Roles.MANAGER.getOperations()));
	   break;
	   
	   case STAFF:
		   System.out.println(Arrays.toString(Roles.STAFF.getOperations()));
	   break;
	   
	   case USER:
		   System.out.println(Arrays.toString(Roles.USER.getOperations()));
	   break;
	   
	   }
	   
}
}*/












import java.util.Arrays;

enum Roles
{
	SUPERADMIN,
	ADMIN,
	MANAGER,
	STAFF,
	USER;
	
  

}

	enum Operations
	{
		
		
		
	    READ(Roles.SUPERADMIN,Roles.ADMIN,Roles.MANAGER,Roles.STAFF,Roles.USER),
		WRITE(Roles.SUPERADMIN,Roles.ADMIN,Roles.MANAGER,Roles.STAFF),
		UPDATE(Roles.SUPERADMIN,Roles.ADMIN,Roles.MANAGER),
		DELETE(Roles.SUPERADMIN,Roles.ADMIN);
		
		private Roles[] roles;	
	 
		Operations(Roles...roles)//var agrs
	    {
	    	this.roles=roles;
	    }
	
	   public Roles[] getRoles()
	   {
		   return this.roles;
	   }
	
	}


public class Taaskk 
{
   public static void main(String[] args)
  {
	   Scanner scan=new Scanner(System.in);
	   
	   System.out.println("Enter the operation name : ");
	   String  operation =scan.next();
	   
	 //`  String operation1="write";
	   Operations r=Operations.valueOf(operation.toUpperCase());
	   switch(r)
	   {
	   case READ:
		   System.out.println(Arrays.toString(Operations.READ.getRoles()));
	   break;
	   
	   case WRITE:
		   System.out.println(Arrays.toString(Operations.WRITE.getRoles()));
	   break;
	  
	   case UPDATE:
		   System.out.println(Arrays.toString(Operations.UPDATE.getRoles()));
	   break;
	   
	   case DELETE:
		   System.out.println(Arrays.toString(Operations.DELETE.getRoles()));
	   break;
	   
	   
	   
	   }
	   
}
}

