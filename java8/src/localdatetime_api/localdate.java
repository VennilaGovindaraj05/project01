package localdatetime_api;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class localdate 
{
	
		//LocalDate
		public static void main(String[] args) 
		{
			
		//	yyyy-mm-dd
			
			//static methods
			
			//now()
			LocalDate obj=LocalDate.now();
			System.out.println(obj);//2025-11-28
			
			//of //user definne 
			LocalDate obj1=LocalDate.of(2004, Month.JANUARY, 05);
			System.out.println(obj1);//2004-01-05
			LocalDate obj01=LocalDate.of(2004, 10, 10);
			System.out.println(obj01);//2004-10-10
			
			//parse()
			LocalDate obj2=LocalDate.parse("2005-07-28");
			System.out.println(obj2);//2005-07-28

		
	        //instances method
			LocalDate obj02=LocalDate.parse("2025-11-28");
			
			//getYear
			System.out.println(obj02.getYear());//2025
			
			//getMonth
		
			System.out.println(obj02.getMonth());//NOVEMBER
			
			int month=obj02.getMonthValue();
			System.out.println(month);//11
			
			
			//getDayOfMonth
			System.out.println(obj02.getDayOfMonth());//28
			
			//getDayOfWeek
			System.out.println(obj02.getDayOfWeek());//FRIDAY
			
			DayOfWeek dw=obj02.getDayOfWeek();
			System.out.println(dw);///FRIDAY
			
			
			//leap year
			System.out.println(obj1.isLeapYear());//true=2004
			
			//lengthofmonth
			System.out.println(obj02.lengthOfMonth());//30
			
			//plusday
			LocalDate plus=obj02.plusDays(4);
			System.out.println(plus);//2025-12-02
			
			//minusmonth
		    
			LocalDate minus=obj02.minusMonths(2);
			System.out.println(minus);//2025-09-28
		
			//minusday
			LocalDate min=obj02.minusDays(3);
			System.out.println(min);//2025-11-25
		
			LocalDate minn=obj02.minusWeeks(4);
			System.out.println(minn);//2025-10-31-
			
			//withdayofmonth
			
	         LocalDate w=obj02.withDayOfMonth(17);
		     System.out.println(w);//2025-11-17
		     
		     //format
		     
		     DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		     LocalDate dtfm=LocalDate.parse("28/11/2025", dtf);
		      System.out.println(dtfm);//2025-11-28
		      System.out.println(dtfm.format(dtf));//28/11/2025
		      
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

		private static DateTimeFormatter format(DateTimeFormatter dtf) {
			// TODO Auto-generated method stub
			return null;
		}

	}



