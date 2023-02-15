package com.Test;


class Date
{
	int day ;
	int month;
	int year;
	
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	void show()
	{
		System.out.println("Joining date : "+day+"-"+month+"-"+year);
	}
}

public class employe {
	
	int empid;
	String name;
	float salary;
	Date jdt;
	
	
	public employe(int empid, String name, float salary,  Date jdt) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.jdt = jdt;
	}

	
//
//	@Override
//	public String toString() {
//		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", jdt=" + jdt + "]";
//	}

	void print()
	{
		System.out.println(this.empid);
		System.out.println(this.name);
		System.out.println(this.salary);
		this.jdt.show();
		//jdt.show();
	}


	public static void main(String[] args) {
		
		employe e = null;
		Date jdt = new Date(21,12,1996);
		e = new employe(121, "Ajay", 45000.00f, jdt);
		System.out.println(e.toString());
		e.print();
	}
	

}
