package localdatetime_api;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class localtime 
{
	
	
		public static void main(String[] args) 
		{
			
			
   //joining date->reliving date
		    
		    LocalDate star=LocalDate.of(2025, 01, 1);
		    LocalDate end=LocalDate.of(2026, 8, 21);
		
		    System.out.println( ChronoUnit.YEARS.between(star, end));
		    System.out.println( ChronoUnit.MONTHS.between(star, end));
		
			
		    
		    //static methods
			
	         LocalTime time=	LocalTime.now();
	         System.out.println(time);//shown current time
		
	         //hh-mm-sec-nano
		     LocalTime time1=LocalTime.of(12, 30, 40, 9);
		     System.out.println(time1);

		     //instances method
		
		     System.out.println(time1.getHour());//12hrs
		    System.out.println( time1.getMinute());//30min
		    System.out.println(time1.withHour(3));//add 3hrs extra	
		    System.out.println(time1.compareTo(time));//-1
		    System.out.println(time1.withMinute(3));//30->3min
		    System.out.println(time1.getSecond());//40seconds
		    System.out.println(time1.getNano());//9nano
		    boolean timee=  time1.isAfter(time);
		    System.out.println(timee);//false
		
		
		
		
		
		
		
		}

	}



