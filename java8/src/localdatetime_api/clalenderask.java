package localdatetime_api;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class clalenderask 
{

	
	
	   public static void main(String[] args) 
	   {
		int year=2005;
		for(int month=1;month<=12;month++)
		{
			LocalDate date=LocalDate.of(year,month,1);
			System.out.println("Month "+date.getMonth());
			
			
			
			System.out.println("Mon\tTue\tWed\tThur\tFri\tSat\tSun");
			
			DayOfWeek dw=date.getDayOfWeek();
			
			int get=dw.getValue();
			
			for(int i=1;i<get;i++)
			{
				System.out.print("\t");
			}
			
			int getmonth=date.lengthOfMonth();
			for(int i=1;i<=getmonth;i++) 
			{
				   LocalDate datee=LocalDate.of(year, month ,i);
					DayOfWeek dow=datee.getDayOfWeek();
				    
				  if(dow == DayOfWeek.SUNDAY)
				  {
					  System.err.println(i+"\t");
				  }
				 System.out.print(i+ "\t");
				  
			}
			System.out.println();
			System.out.println();		
			
		}
	   }
	}


