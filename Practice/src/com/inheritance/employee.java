package com.inheritance;

class Date{
	
	int date;
	int month;
	int year;
	
	Date()
	{
		date=0;
		month=0;
		year=0;
	}
	
	Date(int date, int month, int year)
	{
		this.date = date;
		this.month = month;
		this.year = year;
	}
	
	public void show()
	{
		System.out.println("Joining date : "+date+" "+month+" "+year);
	}
	
}
class employee extends Date {

	String name = "";
	int id = 0;
	float sal = 0;
	
	employee () 
	{
		 name = "";
		 id = 0; 
		 sal = 0;
	}
	 
	employee(String name, int id, float salary) 
	{
		super(21,12,1996);
		this.name =  name;
		this.id = id;
		this.sal = salary;
	}
	public void print() {
		
	    super.show();
		System.out.println("Emplyee Details :"+name+" "+id+" "+sal); 
	}
	
	public static void main(String[] args) {
		
		employee emp = new employee("Akshay",101,60000);
		emp.print();
	}
}