package localdatetime_api;

import java.time.LocalDate;

public class monthsprint 
{
	
	//task

		public static void main(String[] args)
		{
			for(int month=1;month<=12;month++)
			{
				LocalDate obj=LocalDate.of(2004, month, 01);			
				System.out.println("Month :" +obj.getMonth());
				
				int daymonth=obj.lengthOfMonth();
				for(int date=1;date<=daymonth;date++)
				{
			    LocalDate dat=LocalDate.of(2004,month , date);
				//System.out.println(dat);
				System.out.println(date);
				}
			}
			System.out.println("end");
			
			
			
			
			
			
			
		}

	}


}
