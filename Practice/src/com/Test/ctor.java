package com.Test;

public class ctor {
	
	int id;
	String name;
	
	ctor()
	{
		System.out.println("I am in parameterless constructor ");
	}
	
	ctor(int id, String name)
	{
		System.out.println("\nI am in parameterized constructor ");
		this.id=id;
		this.name=name;
	}
	
	
	public static void main(String[] args) { 
		
		ctor c = new ctor();
		System.out.println("Id : "+c.id+ " Name : "+c.name);
		
		ctor c1 = new ctor(101, "Ak");
		System.out.println("Id : "+c1.id+ " Name : "+c1.name);

	} 

}
