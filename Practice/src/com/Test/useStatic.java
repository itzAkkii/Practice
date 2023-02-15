package com.Test;

public class useStatic {
	
    int rollno;         // 4 byte 
	String sname;       // 8 byte
	float marks;        // 4 byte 
	//String collegename; // 8 byte = 24 byte
	
	static String collegename = "SPPU";
	
	//If we make collegename static then 8 byte space required is less.

	useStatic()
	{
	   rollno = 21;
	   sname = "Rahul";
	   marks = 81.25f;
	}
	
	static
	{
		System.out.println(" I am in static block 1...........");
	}
	
    static void printData()
    {
        useStatic u = new useStatic();
        
       System.out.println(u.rollno);
       System.out.println(u.sname);	
       System.out.println(u.marks);	
       System.out.println(collegename);
    } 

	public static void main(String[] args) {
       
		//useStatic US1 = new useStatic();
		
		useStatic.printData();
		
		
	}
	
	static
	{
		System.out.println(" I am in static block 2...........");
	}

}
