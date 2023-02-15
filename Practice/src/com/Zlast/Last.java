package com.Zlast;

public class Last {

	public static void main(String[] args) {
		
		int number = 121;
		
		int temp = number;
		int rem;
		int sum = 0;
		
		while(number>0)
		{
			rem = number%10;          //1--2--1
			sum = (sum*10) + rem;     //1--12-121
			number = number/10;       //12-1--0.1
		}
		
		if(temp==sum)
			System.out.println("Number is Palindrome : "+number);
		else
			System.out.println("Number is not Palindrome. ");
	}
}
