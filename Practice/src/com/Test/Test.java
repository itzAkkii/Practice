 package com.Test;

class Test
{
	
	  static int rollno = 10;         //4 byte
	  String name = "Akshay";         //8 byte
	  float marks = 80;               //4 byte
	
	  void printRecord()                        //non static method 
	  {
		  System.out.println(rollno); 
		  System.out.println(name);
		  System.out.println(marks);
	  }

	public static void main(String[] args)
	{
          //new Test().printRecord();    //Anonymous object
          
          
          Test t = new Test();     //t reference------Object creation
          t.printRecord();         //use of object to call method  
          //t.showRecord();
          
         // System.out.println(a);
          
	}

}
