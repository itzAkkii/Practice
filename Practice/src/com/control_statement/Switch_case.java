package com.control_statement;

import java.util.Scanner;

public class Switch_case {

	public void addition(int a, int b) {
		int result;
		result = a + b;
		System.out.println("Addition is : "+result);
	}
	
	public void subtraction(int a, int b) {
		int result;
		result = a - b;
		System.out.println("subtraction is : "+result);
	}
	
	public void multiplication(int a, int b) {
		int result;
		result = a * b;
		System.out.println("multiplication is : "+result);
	}
	
	public void division(int a, int b) {
		int result;
		result = a / b;
		System.out.println("division is : "+result);
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Switch_case sc = new Switch_case();
		
		//int choice = 5;    //Hardcoded value                           
		
		Scanner scanner = new Scanner(System.in);      // if u want give values from user then use Scanner class. 
		System.out.println("Enter your choice : ");
		int choice = scanner.nextInt();
		
		switch(choice)
		{
		case 1: sc.addition(30, 60);
		 break;
		 
		case 2: sc.subtraction(50, 30);
		 break;
		 
		case 3: sc.multiplication(15, 10);
		 break;
		 
		case 4: sc.division(30, 5);
		 break;
		 
		 default: System.out.println("Invalid choice ");
		 break;
		}
		
	}
}
 