package com.Test;

class parent
{
	 int x = 5;

	 parent()     //this Constructor can not be acquired into subclass . but this will get automatically call 
	 {
			System.out.println("Parent ctor...........");
	 }
	 
	//static public void print()
	public void print()
	{
		System.out.println("Parent class ");
	}
}

public class superr extends parent             //child class
{
	superr()
	{    
		//super();                                       //use this or not it will give call to parent class constructor.
		System.out.println("Child ctor...........");
	}
	
	public void show()
	{
		super.print();                           //invoked super class method or constructor.
		System.out.println("Child class ");
		
		System.out.println(super.x);               //also used to refer super class instance.
	}
	
	

	public static void main(String[] args) {

      superr s = new superr();
      s.show();
      //s.print();
		
//		parent p = new parent();
//		p.print();
      
     
	}

}
