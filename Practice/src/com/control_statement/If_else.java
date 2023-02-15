package com.control_statement;

public class If_else {

	public static void main(String[] args) {
		/*
		 * To check wether given year is leap year or not .
		 * The year should be divisible by 4 but not 100.  ((exp1)&&(exp2))
		 * The year be divisible directly by 400.          ||(exp3)
		 * 
		 *     ((exp1)&&(exp2))||(exp3)
		 *     
		 */
		int year = 2022;
		
		if(((year%4==0)&&(year%100!=0))||(year%400==0))
		{
			System.out.println("Given year : "+ year +" - is leap year");
		}
		else
		{
			System.out.println("Given year : "+ year +" - is not leap year");
		}
	}
}
