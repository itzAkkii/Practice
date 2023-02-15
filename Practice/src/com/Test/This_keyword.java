package com.Test;

public class This_keyword
{
	int a = 10;
	int b = 20;
	
	 void sample(int a, int b)
	{
		//a=a;
		//b=b; 
		
		System.out.println(a);
		System.out.println(b);
		
		//System.out.println(this.a);
		//System.out.println(this.b);
	}

	public static void main(String[] args)
	{
       int a = 5;
       int b = 6;
       
       This_keyword t = new This_keyword();
       t.sample(a, b);
	}

}
