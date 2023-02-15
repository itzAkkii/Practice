package com.inheritance;

class Animal
{
	public void eat()
	{
		System.out.println("Inside Animal class");
	}
}

class dog extends Animal
{
	public void run()
	{
		System.out.println("Inside Dog class");
	}
}

public class program {

	public static void main(String[] args) {

		Animal A = new dog();
		A.eat();
		
		//We can not give call to sub class with the help of reference of super class.
	}

}
