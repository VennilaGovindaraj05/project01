package TaskJDBC;

import java.util.Scanner;

public class AccountCreate
{
	 int acc_id;
	 String acc_name;
	 int acc_num;
     int acc_balance;
	 int mobile_no;
	
	 public AccountCreate()
	 {	
		Scanner scan=new Scanner(System.in);
		
		
		
		System.out.println("Enter Acoount name :");
		acc_name = scan.next();
		
		System.out.println("Enter Acoount num :");
		acc_num = scan.nextInt();
		
		System.out.println("Enter Acoount balances :");
		acc_balance = scan.nextInt();
		
		System.out.println("Enter Acoount mobile number :");
		mobile_no = scan.nextInt();

	 }

	 public int getAcc_id() {
		 return acc_id;
	 }

	 public void setAcc_id(int acc_id) {
		 this.acc_id = acc_id;
	 }

	 public String getAcc_name() {
		 return acc_name;
	 }

	 public void setAcc_name(String acc_name) {
		 this.acc_name = acc_name;
	 }

	 public int getAcc_num() {
		 return acc_num;
	 }

	 public void setAcc_num(int acc_num) {
		 this.acc_num = acc_num;
	 }

	 public int getAcc_balance() {
		 return acc_balance;
	 }

	 public void setAcc_balance(int acc_balance) {
		 this.acc_balance = acc_balance;
	 }

	 public int getMobile_no() {
		 return mobile_no;
	 }

	 public void setMobile_no(int mobile_no) {
		 this.mobile_no = mobile_no;
	 }

	 @Override
	 public String toString() {
		return "AccountCreate [acc_id=" + acc_id + ", acc_name=" + acc_name + ", acc_num=" + acc_num + ", acc_balance="
				+ acc_balance + ", mobile_no=" + mobile_no + "]";
	 }	
	
	 
	
   
 }
