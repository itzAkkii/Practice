package com.Test;

final class final2
{
	// Once class is declared final we can not inherit it.
	// subclass is showing error for that.
}

    public class final1 //extends final2
    {

	final private int a = 10;    //final variable - u cann't make changes in it once initialized.
	
	final void show()
	{
		//u can not make changes in final method once it declare as a final.
		System.out.println(" Fianl variable : "+a);
	}
	
	
	public static void main(String[] args) {
      
	   final1 f1 = new final1();
	   f1.show();
	}
}
    
    
    
    
    
    