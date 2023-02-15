package com.demo;

public class circle
{

	float area;
	
	float calculateArea(int r)
	{
		System.out.println("2");
	    area = (3.14f * r * r);
		return  area;
	}
	
  public static void main(String[] args) 
  {
	circle c = new circle();
	 
	System.out.println("1");
	
    float Area = c.calculateArea( 5 );
	System.out.println("After calculation area is : "+Area);
	
  }
}
