package localdatetime_api;

import java.util.ArrayList;
import java.util.Scanner;

public class Emplyoee
{
	

	
			private String empName;
			private String deptName;
			private int joningDate;
			
			static Scanner scan=new Scanner(System.in);
			ArrayList<Emplyoee>list=new ArrayList<>();


			  Emplyoee()
		      {
			
		      }
			
			
			Emplyoee(String empName,String deptName,int joningDate)
			{
				this.empName=empName;
				this.deptName=deptName;
				this.joningDate=joningDate;	
			}




		public String getEmpName() {
				return empName;
			}


			public void setEmpName(String empName) {
				this.empName = empName;
			}


			public String getDeptName() {
				return deptName;
			}


			public void setDeptName(String deptName) {
				this.deptName = deptName;
			}


			public int getJoningDate() {
				return joningDate;
			}


			public void setJoningDate(int joningDate) {
				this.joningDate = joningDate;
			}


		@Override
			public String toString() {
				return "Emplyoee [empName=" + empName + ", deptName=" + deptName + ", joningDate=" + joningDate ;
			}


		


		

	}



