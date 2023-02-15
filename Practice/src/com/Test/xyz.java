package com.Test;

public class xyz {
	 int num1 = 10;
	 static int num2 = 30;
	
	void print()
	{
		int num1 = 20;
		System.out.println(this.num1);
		System.out.println(num1);
		System.out.println(xyz.num2);
	}

	public static void main(String[] args) {

		xyz x = new xyz();
		x.print();
	}

}
