package com.Test;

public class overlaod {
	
	public static int sum (int a, int b)
	{
		return a+b;
	}
	
	public static double sum (double a, double b)
	{
		return a+b;
	}
	
	public static float sum (float a, float b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		
		System.out.println(overlaod.sum(10, 20));
		System.out.println(overlaod.sum(10.5, 20.4));
		System.out.println(overlaod.sum(10.50f, 20.40f));


	}
	
	

}





















